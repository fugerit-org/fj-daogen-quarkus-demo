package org.fugerit.java.daogen.quickstart.junit5test.model;

import org.fugerit.java.daogen.quickstart.def.facade.Example01Finder;
import org.fugerit.java.daogen.quickstart.def.model.ModelExample01;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperExample01;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperExample01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * Example01Junit5ModelTest, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
class Example01Junit5ModelTest {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final Logger logger = LoggerFactory.getLogger( Example01Junit5ModelTest.class );

	public void printAll( ModelExample01 current ) { 
		logger.info( "FIELD1-> {}", current.getField1() );
		logger.info( "FIELD2-> {}", current.getField2() );
		logger.info( "FIELD3-> {}", current.getField3() );
	}

	public ModelExample01 newInstance() { 
		WrapperExample01 current = new WrapperExample01( new HelperExample01() );
		Assertions.assertTrue( current.isEmpty() );
		current.setField1("1");
		Assertions.assertFalse( current.isEmpty() );
		current.setField2(null);
		Assertions.assertFalse( current.isEmpty() );
		current.setField3("1");
		Assertions.assertFalse( current.isEmpty() );
		logger.info( "unwrap :  {}", current.unwrap( current ) );
		return current;
	}

	@Test
	 void testJUnit5ModelExample01() { 
		ModelExample01 current = this.newInstance();
		this.printAll( current );
		logger.info( "current toString() : {}", current );
		Assertions.assertNotNull( current );
		Example01Finder finder1 = new Example01Finder();
		finder1.setModel( current );
		logger.info( "finder1.getModel() -> {}", finder1.getModel() );
		Assertions.assertNotNull( Example01Finder.newInstance( current ) );
		Assertions.assertNotNull( finder1 );
	}

}
