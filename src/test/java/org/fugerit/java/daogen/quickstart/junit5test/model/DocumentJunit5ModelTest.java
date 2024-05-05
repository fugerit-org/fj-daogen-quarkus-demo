package org.fugerit.java.daogen.quickstart.junit5test.model;

import org.fugerit.java.daogen.quickstart.def.facade.DocumentFinder;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperDocument;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * DocumentJunit5ModelTest, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
class DocumentJunit5ModelTest {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final Logger logger = LoggerFactory.getLogger( DocumentJunit5ModelTest.class );

	public void printAll( ModelDocument current ) { 
		logger.info( "ID-> {}", current.getId() );
		logger.info( "ID_OWNER-> {}", current.getIdOwner() );
		logger.info( "ID_CREATOR-> {}", current.getIdCreator() );
		logger.info( "CREATION_DATE-> {}", current.getCreationDate() );
		logger.info( "UPDATE_DATE-> {}", current.getUpdateDate() );
		logger.info( "PATH-> {}", current.getPath() );
		logger.info( "STATE-> {}", current.getState() );
		logger.info( "INFO-> {}", current.getInfo() );
	}

	public ModelDocument newInstance() { 
		WrapperDocument current = new WrapperDocument( new HelperDocument() );
		Assertions.assertTrue( current.isEmpty() );
		current.setId(new java.math.BigDecimal( "1" ));
		Assertions.assertFalse( current.isEmpty() );
		current.setIdOwner(new java.math.BigDecimal( "1" ));
		Assertions.assertFalse( current.isEmpty() );
		current.setIdCreator(new java.math.BigDecimal( "1" ));
		Assertions.assertFalse( current.isEmpty() );
		current.setCreationDate(null);
		Assertions.assertFalse( current.isEmpty() );
		current.setUpdateDate(null);
		Assertions.assertFalse( current.isEmpty() );
		current.setPath("1");
		Assertions.assertFalse( current.isEmpty() );
		current.setState(new java.math.BigDecimal( "1" ));
		Assertions.assertFalse( current.isEmpty() );
		current.setInfo(null);
		Assertions.assertFalse( current.isEmpty() );
		logger.info( "unwrap :  {}", current.unwrap( current ) );
		return current;
	}

	@Test
	 void testJUnit5ModelDocument() { 
		ModelDocument current = this.newInstance();
		this.printAll( current );
		logger.info( "current toString() : {}", current );
		Assertions.assertNotNull( current );
		DocumentFinder finder1 = new DocumentFinder();
		finder1.setModel( current );
		logger.info( "finder1.getModel() -> {}", finder1.getModel() );
		finder1.setId( current.getId() );
		Assertions.assertEquals( current.getId(), finder1.getId() );
		Assertions.assertNotNull( DocumentFinder.newInstance( current.getId() ) );
		Assertions.assertNotNull( DocumentFinder.newInstance( current ) );
		Assertions.assertNotNull( finder1 );
	}

}
