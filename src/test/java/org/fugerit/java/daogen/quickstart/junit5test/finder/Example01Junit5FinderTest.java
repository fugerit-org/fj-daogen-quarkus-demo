package org.fugerit.java.daogen.quickstart.junit5test.finder;

import org.fugerit.java.daogen.quickstart.def.facade.Example01Finder;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperExample01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Example01Junit5FinderTest {

	@Test
	 void testJUnit5ModelDocument() {
		Example01Finder current = new Example01Finder();
		current.setModel( new HelperExample01() );
		current.setId( 1001L );
		Assertions.assertNotNull( current );
	}

}
