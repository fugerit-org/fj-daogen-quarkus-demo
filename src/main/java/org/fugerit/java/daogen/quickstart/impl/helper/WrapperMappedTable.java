package org.fugerit.java.daogen.quickstart.impl.helper;

import org.fugerit.java.core.db.daogen.BasicWrapper;
import org.fugerit.java.daogen.quickstart.def.model.ModelMappedTable;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * WrapperMappedTable, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class WrapperMappedTable extends BasicWrapper<ModelMappedTable> implements ModelMappedTable {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 361129410880L;

	public WrapperMappedTable( ModelMappedTable wrapped ) {
		super( wrapped );
	}

	public ModelMappedTable unwrap( WrapperMappedTable wrapper ) {
		ModelMappedTable res = wrapper;
		while ( res instanceof WrapperMappedTable wrappedinstance ) { 
			res = wrappedinstance.unwrapModel();
		}
		return res;
	}

	/*
	 * fields generated for entity attributes 
	 */
	@Override
	public void setId( java.math.BigDecimal value ) {
		this.unwrapModel().setId( value );
	}

	@Override
	public java.math.BigDecimal getId() {
		return this.unwrapModel().getId();
	}

	@Override
	public void setContent( java.lang.String value ) {
		this.unwrapModel().setContent( value );
	}

	@Override
	public java.lang.String getContent() {
		return this.unwrapModel().getContent();
	}

	@Override
	public boolean isEmpty() {
		return this.unwrapModel().isEmpty();
	}

}
