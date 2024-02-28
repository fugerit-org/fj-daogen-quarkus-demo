package org.fugerit.java.daogen.quickstart.junit5test.model;

import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperDocument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * DocumentJunit4ModelTest, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
class DocumentJunit4ModelTest {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final Logger logger = LoggerFactory.getLogger( DocumentJunit4ModelTest.class );
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
		HelperDocument current = new HelperDocument();
		current.setId(new java.math.BigDecimal( "1" ));
		current.setIdOwner(new java.math.BigDecimal( "1" ));
		current.setIdCreator(new java.math.BigDecimal( "1" ));
		current.setCreationDate(new java.util.Date());
		current.setUpdateDate(new java.util.Date());
		current.setPath("1");
		current.setState(new java.math.BigDecimal( "1" ));
		current.setInfo(null);
		return current;
	}
	@Test
	 void testJUnit4ModelDocument() { 
		ModelDocument current = this.newInstance();
		this.printAll( current );
		Assertions.assertNotNull( current );
	}

}
