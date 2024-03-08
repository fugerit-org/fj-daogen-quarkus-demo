package org.fugerit.java.daogen.quickstart.config;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.fugerit.java.core.db.daogen.BasicDaoResult;
import org.fugerit.java.core.db.daogen.CloseableDAOContextSC;
import org.fugerit.java.daogen.quickstart.def.facade.EntityPersonFacade;
import org.fugerit.java.daogen.quickstart.def.facade.QuickstartLogicFacade;
import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;
import org.fugerit.java.daogen.quickstart.impl.facade.data.QuickstartDataLogicFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@ApplicationScoped
public class AppConfig {

    private static final Logger logger = LoggerFactory.getLogger( AppConfig.class );

    private QuickstartLogicFacade facade = new QuickstartDataLogicFacade();

    private DataSource dataSource;

    AppConfig( DataSource dataSource ) {
        this.dataSource = dataSource;
    }

    void onStart(@Observes StartupEvent ev) {
        logger.info( "onStart BEGIN" );
        logger.info( "********************************************************************" );
        try ( Connection conn = this.dataSource.getConnection();
              CloseableDAOContextSC context = new CloseableDAOContextSC( conn ) ) {
            DatabaseMetaData dbmd = conn.getMetaData();
            logger.info( "database : {} - {}", dbmd.getDatabaseProductName(), dbmd.getDatabaseProductVersion() );
            logger.info( "url : {}", dbmd.getURL() );
            logger.info( ">>>>>>>>>>>>>>>>>>> daogen test 1: " );
            EntityPersonFacade personFacade = facade.getEntityPersonFacade();
            BasicDaoResult<ModelPerson> result = personFacade.loadAll( context );
            logger.info( "result : {}", result );
            if (result.isResultOk() ) {
                for (ModelPerson model : result.getList()) {
                    logger.info( "model : {}", model );
                }
            }
        } catch (Exception e) {
            logger.info( "onStart ERROR : "+e, e );
        }
        logger.info( "********************************************************************" );
        logger.info( "onStart END" );
    }

}