package org.fugerit.java.daogen.quickstart.impl.rse;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.fugerit.java.core.db.daogen.BasicRSExtractor;
import org.fugerit.java.daogen.quickstart.def.model.ModelExample01;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperExample01;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * Example01RSE, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class Example01RSE extends BasicRSExtractor<ModelExample01> {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 387383893717L;

	public static final Example01RSE DEFAULT = new Example01RSE();

	@Override
	public ModelExample01 extractNext( ResultSet rs ) throws SQLException { 
		HelperExample01 current = new HelperExample01();
		current.setField1( rs.getString( "FIELD1" )  );
		current.setField2( org.fugerit.java.core.db.daogen.SQLTypeConverter.utilDateToLocalDate( rs.getDate( "FIELD2" ) )  );
		current.setField3( rs.getString( "FIELD3" )  );
		return current;
	} 
}
