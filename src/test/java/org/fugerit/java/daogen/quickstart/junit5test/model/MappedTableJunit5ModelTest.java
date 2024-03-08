package org.fugerit.java.daogen.quickstart.junit5test.model;

import org.fugerit.java.daogen.quickstart.def.model.ModelMappedTable;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperMappedTable;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperMappedTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * MappedTableJunit5ModelTest, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
class MappedTableJunit5ModelTest {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final Logger logger = LoggerFactory.getLogger( MappedTableJunit5ModelTest.class );
	public void printAll( ModelMappedTable current ) { 
		 logger.info( "ID-> {}", current.getId() );
		 logger.info( "CONTENT-> {}", current.getContent() );
	}

	public ModelMappedTable newInstance() { 
		WrapperMappedTable current = new WrapperMappedTable( new HelperMappedTable() );
		current.setId(new java.math.BigDecimal( "1" ));
		current.setContent("1");
		return current;
	}
	@Test
	 void testJUnit5ModelMappedTable() { 
		ModelMappedTable current = this.newInstance();
		this.printAll( current );
		Assertions.assertNotNull( current );
	}

}
