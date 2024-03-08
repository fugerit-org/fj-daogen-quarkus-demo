package org.fugerit.java.daogen.quickstart.impl.helper;

import org.fugerit.java.daogen.quickstart.def.model.ModelExample01;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * HelperExample01, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class HelperExample01 implements ModelExample01 {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	/*
	 * fields generated for entity attributes 
	 */
	private java.lang.String field1;

	@Override
	public void setField1( java.lang.String value ) {
		this.field1 = value;
	}

	@Override
	public java.lang.String getField1() {
		return this.field1;
	}

	private java.util.Date field2;

	@Override
	public void setField2( java.util.Date value ) {
		this.field2 = value;
	}

	@Override
	public java.util.Date getField2() {
		return this.field2;
	}

	private java.lang.String field3;

	@Override
	public void setField3( java.lang.String value ) {
		this.field3 = value;
	}

	@Override
	public java.lang.String getField3() {
		return this.field3;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append( this.getClass().getSimpleName() );
		buffer.append( "[field1=" );
		buffer.append( this.getField1() );
		buffer.append( ",field2=" );
		buffer.append( this.getField2() );
		buffer.append( ",field3=" );
		buffer.append( this.getField3() );
		buffer.append( "]" );
		return buffer.toString();
	}

	@Override
	public boolean isEmpty() {
		return  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getField1() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getField2() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getField3() ) );
	}

}
