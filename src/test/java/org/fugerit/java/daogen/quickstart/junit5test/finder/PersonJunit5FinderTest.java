package org.fugerit.java.daogen.quickstart.junit5test.finder;

import org.fugerit.java.daogen.quickstart.def.facade.PersonFinder;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperPerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonJunit5FinderTest {

	@Test
	 void testJUnit5ModelDocument() {
		PersonFinder current = new PersonFinder();
		current.setModel( new HelperPerson() );
		current.setId( 1003L );
		Assertions.assertNotNull( current );
		Assertions.assertNotNull( PersonFinder.newInstance( current.getId() ) );
		Assertions.assertNotNull( PersonFinder.newInstance( current.getModel() ) );
	}

}
