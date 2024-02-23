package org.fugerit.java.daogen.quickstart.def.facade;

import org.fugerit.java.core.db.daogen.BaseIdFinder;
import org.fugerit.java.daogen.quickstart.def.model.ModelExample01;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * Example01Finder, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class Example01Finder extends BaseIdFinder {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 660100160067L;

	private ModelExample01 model;

	public void setModel( ModelExample01 model ) {
		this.model = model;
	}

	public ModelExample01 getModel() {
		return this.model;
	}

	/**
	 * Factory method to create a new finder 
	 *
	 * @param model		the model to wrap in the finder
	 *
	 * @return	the finder
	 */
	public static Example01Finder newInstance( ModelExample01 model ) { 
		Example01Finder finder = new Example01Finder();
		// default id not available for this entity
		finder.setModel( model );
		return finder;
	}

}
