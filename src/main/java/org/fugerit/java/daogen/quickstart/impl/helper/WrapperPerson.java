package org.fugerit.java.daogen.quickstart.impl.helper;

import org.fugerit.java.core.db.daogen.BasicWrapper;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;
import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * WrapperPerson, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class WrapperPerson extends BasicWrapper<ModelPerson> implements ModelPerson {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 294847170299L;

	private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
		// this class is conditionally serializable, depending on contained object
		// special situation can be handled using this method in future
		out.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		// this class is conditionally serializable, depending on contained object
		// special situation can be handled using this method in future
		in.defaultReadObject();
	}

	public WrapperPerson( ModelPerson wrapped ) {
		super( wrapped );
	}

	public ModelPerson unwrap( WrapperPerson wrapper ) {
		ModelPerson res = wrapper;
		while ( res instanceof WrapperPerson wrappedinstance ) { 
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
	public void setSurname( java.lang.String value ) {
		this.unwrapModel().setSurname( value );
	}

	@Override
	public java.lang.String getSurname() {
		return this.unwrapModel().getSurname();
	}

	@Override
	public void setName( java.lang.String value ) {
		this.unwrapModel().setName( value );
	}

	@Override
	public java.lang.String getName() {
		return this.unwrapModel().getName();
	}

	@Override
	public void setBirthDate( java.util.Date value ) {
		this.unwrapModel().setBirthDate( value );
	}

	@Override
	public java.util.Date getBirthDate() {
		return this.unwrapModel().getBirthDate();
	}

	@Override
	public void setNote( java.lang.String value ) {
		this.unwrapModel().setNote( value );
	}

	@Override
	public java.lang.String getNote() {
		return this.unwrapModel().getNote();
	}

	@Override
	public void setIdMother( java.math.BigDecimal value ) {
		this.unwrapModel().setIdMother( value );
	}

	@Override
	public java.math.BigDecimal getIdMother() {
		return this.unwrapModel().getIdMother();
	}

	@Override
	public void setIdFather( java.math.BigDecimal value ) {
		this.unwrapModel().setIdFather( value );
	}

	@Override
	public java.math.BigDecimal getIdFather() {
		return this.unwrapModel().getIdFather();
	}

	@Override
	public void setVirtualNote( java.lang.String value ) {
		this.unwrapModel().setVirtualNote( value );
	}

	@Override
	public java.lang.String getVirtualNote() {
		return this.unwrapModel().getVirtualNote();
	}

	/*
	 * fields generated for relations 
	 */

	@Override
	public void setMother( ModelPerson value ) {
		this.unwrapModel().setMother( value );
	}

	@Override
	public ModelPerson getMother() {
		return this.unwrapModel().getMother();
	}

	@Override
	public void setFather( ModelPerson value ) {
		this.unwrapModel().setFather( value );
	}

	@Override
	public ModelPerson getFather() {
		return this.unwrapModel().getFather();
	}

	@Override
	public void setOwnedDocuments( java.util.List<ModelDocument> value ) {
		this.unwrapModel().setOwnedDocuments( value );
	}

	@Override
	public java.util.List<ModelDocument> getOwnedDocuments() {
		return this.unwrapModel().getOwnedDocuments();
	}

	@Override
	public boolean isEmpty() {
		return this.unwrapModel().isEmpty();
	}

}
