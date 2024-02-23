package org.fugerit.java.daogen.quickstart.impl.helper;

import org.fugerit.java.core.db.daogen.BasicHelper;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * HelperDocument, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class HelperDocument extends BasicHelper implements ModelDocument {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 738586255343L;

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

	private java.math.BigDecimal idOwner;

	@Override
	public void setIdOwner( java.math.BigDecimal value ) {
		this.idOwner = value;
	}

	@Override
	public java.math.BigDecimal getIdOwner() {
		return this.idOwner;
	}

	private java.math.BigDecimal idCreator;

	@Override
	public void setIdCreator( java.math.BigDecimal value ) {
		this.idCreator = value;
	}

	@Override
	public java.math.BigDecimal getIdCreator() {
		return this.idCreator;
	}

	private java.util.Date creationDate;

	@Override
	public void setCreationDate( java.util.Date value ) {
		this.creationDate = value;
	}

	@Override
	public java.util.Date getCreationDate() {
		return this.creationDate;
	}

	private java.util.Date updateDate;

	@Override
	public void setUpdateDate( java.util.Date value ) {
		this.updateDate = value;
	}

	@Override
	public java.util.Date getUpdateDate() {
		return this.updateDate;
	}

	private java.lang.String path;

	@Override
	public void setPath( java.lang.String value ) {
		this.path = value;
	}

	@Override
	public java.lang.String getPath() {
		return this.path;
	}

	private java.math.BigDecimal state;

	@Override
	public void setState( java.math.BigDecimal value ) {
		this.state = value;
	}

	@Override
	public java.math.BigDecimal getState() {
		return this.state;
	}

	private org.fugerit.java.core.db.daogen.CharArrayDataHandler info;

	@Override
	public void setInfo( org.fugerit.java.core.db.daogen.CharArrayDataHandler value ) {
		this.info = value;
	}

	@Override
	public org.fugerit.java.core.db.daogen.CharArrayDataHandler getInfo() {
		return this.info;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append( this.getClass().getSimpleName() );
		buffer.append( "[id=" );
		buffer.append( this.getId() );
		buffer.append( ",idOwner=" );
		buffer.append( this.getIdOwner() );
		buffer.append( ",idCreator=" );
		buffer.append( this.getIdCreator() );
		buffer.append( ",creationDate=" );
		buffer.append( this.getCreationDate() );
		buffer.append( ",updateDate=" );
		buffer.append( this.getUpdateDate() );
		buffer.append( ",path=" );
		buffer.append( this.getPath() );
		buffer.append( ",state=" );
		buffer.append( this.getState() );
		buffer.append( ",info=" );
		buffer.append( this.getInfo() );
		buffer.append( "]" );
		return buffer.toString();
	}

	@Override
	public boolean isEmpty() {
		return  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getId() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getIdOwner() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getIdCreator() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getCreationDate() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getUpdateDate() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getPath() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getState() ) )
		 &&  ( org.fugerit.java.core.lang.compare.CheckEmptyHelper.isEmpty( this.getInfo() ) );
	}

}
