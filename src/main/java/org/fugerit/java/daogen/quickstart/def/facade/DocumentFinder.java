package org.fugerit.java.daogen.quickstart.def.facade;

import org.fugerit.java.core.db.daogen.IdFinderNG;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * DocumentFinder, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class DocumentFinder extends IdFinderNG {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private ModelDocument model;

	public void setModel( ModelDocument model ) {
		this.model = model;
	}

	public ModelDocument getModel() {
		return this.model;
	}

	/**
	 *Factory method to create a new finder 
	 *
	 * @param id		id to wrap in the finder
	 *
	 * @return	the finder
	 */
	public static DocumentFinder newInstance( java.math.BigDecimal id ) { 
		DocumentFinder finder = new DocumentFinder();
		finder.setId( id );
		return finder;
	}

	/**
	 * Factory method to create a new finder 
	 *
	 * @param model		the model to wrap in the finder
	 *
	 * @return	the finder
	 */
	public static DocumentFinder newInstance( ModelDocument model ) { 
		DocumentFinder finder = new DocumentFinder();
		finder.setId( model.getId() );
		finder.setModel( model );
		return finder;
	}

}
