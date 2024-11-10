package org.fugerit.java.daogen.quickstart.impl.rse;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.fugerit.java.core.db.daogen.BasicRSExtractor;
import org.fugerit.java.daogen.quickstart.def.model.ModelMappedTable;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperMappedTable;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * MappedTableRSE, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class MappedTableRSE extends BasicRSExtractor<ModelMappedTable> {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 324511825120L;

	@Override
	public ModelMappedTable extractNext( ResultSet rs ) throws SQLException { 
		HelperMappedTable current = new HelperMappedTable();
		current.setId( rs.getBigDecimal( "ID" )  );
		current.setContent( rs.getString( "CONTENT" )  );
		return current;
	} 
}
