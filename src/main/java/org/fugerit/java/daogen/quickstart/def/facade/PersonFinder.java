package org.fugerit.java.daogen.quickstart.def.facade;

import org.fugerit.java.core.db.daogen.IdFinderNG;
import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * PersonFinder, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class PersonFinder extends IdFinderNG {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private ModelPerson model;

	public void setModel( ModelPerson model ) {
		this.model = model;
	}

	public ModelPerson getModel() {
		return this.model;
	}

	/**
	 *Factory method to create a new finder 
	 *
	 * @param id		id to wrap in the finder
	 *
	 * @return	the finder
	 */
	public static PersonFinder newInstance( java.math.BigDecimal id ) { 
		PersonFinder finder = new PersonFinder();
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
	public static PersonFinder newInstance( ModelPerson model ) { 
		PersonFinder finder = new PersonFinder();
		finder.setId( model.getId() );
		finder.setModel( model );
		return finder;
	}

}
