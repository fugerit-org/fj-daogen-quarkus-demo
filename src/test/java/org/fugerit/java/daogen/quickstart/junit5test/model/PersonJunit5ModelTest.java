package org.fugerit.java.daogen.quickstart.junit5test.model;

import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperPerson;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperPerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * PersonJunit5ModelTest, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
class PersonJunit5ModelTest {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final Logger logger = LoggerFactory.getLogger( PersonJunit5ModelTest.class );
	public void printAll( ModelPerson current ) { 
		 logger.info( "ID-> {}", current.getId() );
		 logger.info( "SURNAME-> {}", current.getSurname() );
		 logger.info( "NAME-> {}", current.getName() );
		 logger.info( "BIRTH_DATE-> {}", current.getBirthDate() );
		 logger.info( "NOTE-> {}", current.getNote() );
		 logger.info( "ID_MOTHER-> {}", current.getIdMother() );
		 logger.info( "ID_FATHER-> {}", current.getIdFather() );
	}

	public ModelPerson newInstance() { 
		WrapperPerson current = new WrapperPerson( new HelperPerson() );
		current.setId(new java.math.BigDecimal( "1" ));
		current.setSurname("1");
		current.setName("1");
		current.setBirthDate(new java.util.Date());
		current.setNote("1");
		current.setIdMother(new java.math.BigDecimal( "1" ));
		current.setIdFather(new java.math.BigDecimal( "1" ));
		return current;
	}
	@Test
	 void testJUnit5ModelPerson() { 
		ModelPerson current = this.newInstance();
		this.printAll( current );
		Assertions.assertNotNull( current );
	}

}
