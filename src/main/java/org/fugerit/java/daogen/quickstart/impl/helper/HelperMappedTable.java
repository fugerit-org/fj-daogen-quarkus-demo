package org.fugerit.java.daogen.quickstart.impl.helper;

import org.fugerit.java.daogen.quickstart.def.model.ModelMappedTable;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * HelperMappedTable, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class HelperMappedTable implements ModelMappedTable {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	/*
	 * fields generated for entity attributes 
	 */
	private java.math.BigDecimal id;

	@Override
	public void setId( java.math.BigDecimal value ) {
		this.id = value;
	}

	@Override
	public java.math.BigDecimal getId() {
		return this.id;
	}

	private java.lang.String content;

	@Override
	public void setContent( java.lang.String value ) {
		this.content = value;
	}

	@Override
	public java.lang.String getContent() {
		return this.content;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append( this.getClass().getSimpleName() );
		buffer.append( "[id=" );
		buffer.append( this.getId() );
		buffer.append( ",content=" );
		buffer.append( this.getContent() );
		buffer.append( "]" );
		return buffer.toString();
	}

	@Override
	public boolean isEmpty() {
		return  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getId() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getContent() ) );
	}

}
