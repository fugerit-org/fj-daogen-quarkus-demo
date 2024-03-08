package org.fugerit.java.daogen.quickstart.impl.helper;

import org.fugerit.java.core.db.daogen.BasicWrapperNG;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * WrapperDocument, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class WrapperDocument extends BasicWrapperNG<ModelDocument> implements ModelDocument {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	public WrapperDocument( ModelDocument wrapped ) {
		super( wrapped );
	}

	public ModelDocument unwrap( WrapperDocument wrapper ) {
		ModelDocument res = wrapper;
		while ( res instanceof WrapperDocument wrappedinstance ) { 
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
	public void setIdOwner( java.math.BigDecimal value ) {
		this.unwrapModel().setIdOwner( value );
	}

	@Override
	public java.math.BigDecimal getIdOwner() {
		return this.unwrapModel().getIdOwner();
	}

	@Override
	public void setIdCreator( java.math.BigDecimal value ) {
		this.unwrapModel().setIdCreator( value );
	}

	@Override
	public java.math.BigDecimal getIdCreator() {
		return this.unwrapModel().getIdCreator();
	}

	@Override
	public void setCreationDate( java.util.Date value ) {
		this.unwrapModel().setCreationDate( value );
	}

	@Override
	public java.util.Date getCreationDate() {
		return this.unwrapModel().getCreationDate();
	}

	@Override
	public void setUpdateDate( java.util.Date value ) {
		this.unwrapModel().setUpdateDate( value );
	}

	@Override
	public java.util.Date getUpdateDate() {
		return this.unwrapModel().getUpdateDate();
	}

	@Override
	public void setPath( java.lang.String value ) {
		this.unwrapModel().setPath( value );
	}

	@Override
	public java.lang.String getPath() {
		return this.unwrapModel().getPath();
	}

	@Override
	public void setState( java.math.BigDecimal value ) {
		this.unwrapModel().setState( value );
	}

	@Override
	public java.math.BigDecimal getState() {
		return this.unwrapModel().getState();
	}

	@Override
	public void setInfo( org.fugerit.java.core.db.daogen.CharArrayDataHandler value ) {
		this.unwrapModel().setInfo( value );
	}

	@Override
	public org.fugerit.java.core.db.daogen.CharArrayDataHandler getInfo() {
		return this.unwrapModel().getInfo();
	}

	@Override
	public boolean isEmpty() {
		return this.unwrapModel().isEmpty();
	}

}
