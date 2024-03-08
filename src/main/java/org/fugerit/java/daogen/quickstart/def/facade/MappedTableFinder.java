package org.fugerit.java.daogen.quickstart.def.facade;

import org.fugerit.java.core.db.daogen.IdFinderNG;
import org.fugerit.java.daogen.quickstart.def.model.ModelMappedTable;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * MappedTableFinder, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class MappedTableFinder extends IdFinderNG {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private ModelMappedTable model;

	public void setModel( ModelMappedTable model ) {
		this.model = model;
	}

	public ModelMappedTable getModel() {
		return this.model;
	}

	/**
	 *Factory method to create a new finder 
	 *
	 * @param id		id to wrap in the finder
	 *
	 * @return	the finder
	 */
	public static MappedTableFinder newInstance( java.math.BigDecimal id ) { 
		MappedTableFinder finder = new MappedTableFinder();
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
	public static MappedTableFinder newInstance( ModelMappedTable model ) { 
		MappedTableFinder finder = new MappedTableFinder();
		finder.setId( model.getId() );
		finder.setModel( model );
		return finder;
	}

}
