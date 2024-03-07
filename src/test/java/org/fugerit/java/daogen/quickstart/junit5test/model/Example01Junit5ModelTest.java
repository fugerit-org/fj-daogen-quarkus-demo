package org.fugerit.java.daogen.quickstart.junit5test.model;

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
		current.setField1("1");
		current.setField2(new java.util.Date());
		current.setField3("1");
		return current;
	}
	@Test
	 void testJUnit4ModelExample01() { 
		ModelExample01 current = this.newInstance();
		this.printAll( current );
		Assertions.assertNotNull( current );
	}

}
