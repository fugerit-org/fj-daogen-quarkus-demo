package org.fugerit.java.daogen.quickstart.config;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.fugerit.java.core.db.daogen.BasicDaoResult;
import org.fugerit.java.core.db.daogen.CloseableDAOContextSC;
import org.fugerit.java.daogen.quickstart.def.facade.EntityPersonFacade;
import org.fugerit.java.daogen.quickstart.def.facade.QuickstartLogicFacade;
import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;
import org.fugerit.java.daogen.quickstart.impl.facade.data.QuickstartDataLogicFacade;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@Slf4j
@ApplicationScoped
public class AppConfig {

    public AppConfig() {
        this.facade = new QuickstartDataLogicFacade();
    }

    @Inject // constructor injection
    public AppConfig(DataSource dataSource) {
        this();
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

    private QuickstartLogicFacade facade;

    void onStart(@Observes StartupEvent ev) {
        log.info( "onStart BEGIN" );
        log.info( "********************************************************************" );
        try ( Connection conn = this.dataSource.getConnection();
              CloseableDAOContextSC context = new CloseableDAOContextSC( conn ) ) {
            DatabaseMetaData dbmd = conn.getMetaData();
            log.info( "database : {} - {}", dbmd.getDatabaseProductName(), dbmd.getDatabaseProductVersion() );
            log.info( "url : {}", dbmd.getURL() );
            log.info( ">>>>>>>>>>>>>>>>>>> daogen test 1: " );
            EntityPersonFacade personFacade = facade.getEntityPersonFacade();
            BasicDaoResult<ModelPerson> result = personFacade.loadAll( context );
            log.info( "result : {}", result );
            if (result.isResultOk() ) {
                for (ModelPerson model : result.getList()) {
                    log.info( "model : {}", model );
                }
            }
        } catch (Exception e) {
            log.info( "onStart ERROR : "+e, e );
        }
        log.info( "********************************************************************" );
        log.info( "onStart END" );
    }

}