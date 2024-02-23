package org.fugerit.java.daogen.quickstart.impl.rse;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.fugerit.java.core.db.daogen.BasicRSExtractor;
import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperPerson;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * PersonRSE, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class PersonRSE extends BasicRSExtractor<ModelPerson> {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 102069616197L;

	public static final PersonRSE DEFAULT = new PersonRSE();

	@Override
	public ModelPerson extractNext( ResultSet rs ) throws SQLException { 
		HelperPerson current = new HelperPerson();
		current.setId( rs.getBigDecimal( "ID" )  );
		current.setSurname( rs.getString( "SURNAME" )  );
		current.setName( rs.getString( "NAME" )  );
		current.setBirthDate( rs.getTimestamp( "BIRTH_DATE" )  );
		current.setNote( rs.getString( "NOTE" )  );
		current.setIdMother( rs.getBigDecimal( "ID_MOTHER" )  );
		current.setIdFather( rs.getBigDecimal( "ID_FATHER" )  );
		return current;
	} 
}
