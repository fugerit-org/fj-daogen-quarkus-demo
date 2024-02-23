package org.fugerit.java.daogen.quickstart.impl.rse;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.fugerit.java.core.db.daogen.BasicRSExtractor;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperDocument;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * DocumentRSE, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class DocumentRSE extends BasicRSExtractor<ModelDocument> {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 872607081519L;

	public static final DocumentRSE DEFAULT = new DocumentRSE();

	@Override
	public ModelDocument extractNext( ResultSet rs ) throws SQLException { 
		HelperDocument current = new HelperDocument();
		current.setId( rs.getBigDecimal( "ID" )  );
		current.setIdOwner( rs.getBigDecimal( "ID_OWNER" )  );
		current.setIdCreator( rs.getBigDecimal( "ID_CREATOR" )  );
		current.setCreationDate( rs.getTimestamp( "CREATION_DATE" )  );
		current.setUpdateDate( rs.getTimestamp( "UPDATE_DATE" )  );
		current.setPath( rs.getString( "PATH" )  );
		current.setState( rs.getBigDecimal( "STATE" )  );
		try { 
			current.setInfo( org.fugerit.java.core.db.daogen.CharArrayDataHandler.newHandlerPreload( rs.getClob( "INFO" ) )  );
		} catch (Exception e) {
			throw new SQLException( "Errore estrazione campo : INFO", e );
		}
		return current;
	} 
}
