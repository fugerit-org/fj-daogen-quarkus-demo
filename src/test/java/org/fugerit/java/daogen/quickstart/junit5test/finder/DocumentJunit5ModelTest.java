package org.fugerit.java.daogen.quickstart.junit5test.finder;

import org.fugerit.java.daogen.quickstart.def.facade.DocumentFinder;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DocumentJunit5FinderTest {

	@Test
	 void testJUnit5ModelDocument() {
		DocumentFinder current = new DocumentFinder();
		current.setModel( new HelperDocument() );
		current.setId( 1000L );
		Assertions.assertNotNull( current );
	}

}
