package org.fugerit.java.daogen.quickstart.junit5test.finder;

import org.fugerit.java.daogen.quickstart.def.facade.MappedTableFinder;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperMappedTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MappedTableJunit5FinderTest {

	@Test
	 void testJUnit5ModelDocument() {
		MappedTableFinder current = new MappedTableFinder();
		current.setModel( new HelperMappedTable() );
		current.setId( 1002L );
		Assertions.assertNotNull( current );
		Assertions.assertNotNull( MappedTableFinder.newInstance( current.getId() ) );
		Assertions.assertNotNull( MappedTableFinder.newInstance( current.getModel() ) );
	}

}
