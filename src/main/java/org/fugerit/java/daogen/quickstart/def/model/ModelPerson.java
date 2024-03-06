package org.fugerit.java.daogen.quickstart.def.model;

import org.fugerit.java.daogen.quickstart.impl.helper.HelperPerson;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ModelPerson, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
@org.fugerit.java.core.lang.annotate.DefineImpl(as = HelperPerson.class)
public interface ModelPerson extends org.fugerit.java.core.lang.compare.CheckEmpty {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	/**
	 * Getter method for property : id (nullable: no)
	 *
	 * Person id
	 *
	 * @return the value of id
	 */
	java.math.BigDecimal getId();

	/**
	 * Setter method for property : id (nullable: no)
	 *
	 * Person id
	 *
	 * @param value the value of id
	 */
	void setId( java.math.BigDecimal value );

	/**
	 * Getter method for property : surname (nullable: no)
	 *
	 * Person surname
	 *
	 * @return the value of surname
	 */
	java.lang.String getSurname();

	/**
	 * Setter method for property : surname (nullable: no)
	 *
	 * Person surname
	 *
	 * @param value the value of surname
	 */
	void setSurname( java.lang.String value );

	/**
	 * Getter method for property : name (nullable: no)
	 *
	 * Person name
	 *
	 * @return the value of name
	 */
	java.lang.String getName();

	/**
	 * Setter method for property : name (nullable: no)
	 *
	 * Person name
	 *
	 * @param value the value of name
	 */
	void setName( java.lang.String value );

	/**
	 * Getter method for property : birthDate (nullable: no)
	 *
	 * Person birth date
	 *
	 * @return the value of birthDate
	 */
	java.util.Date getBirthDate();

	/**
	 * Setter method for property : birthDate (nullable: no)
	 *
	 * Person birth date
	 *
	 * @param value the value of birthDate
	 */
	void setBirthDate( java.util.Date value );

	/**
	 * Getter method for property : note (nullable: no)
	 *
	 * Notes on people
	 *
	 * @return the value of note
	 */
	java.lang.String getNote();

	/**
	 * Setter method for property : note (nullable: no)
	 *
	 * Notes on people
	 *
	 * @param value the value of note
	 */
	void setNote( java.lang.String value );

	/**
	 * Getter method for property : idMother (nullable: yes)
	 *
	 * Reference to mother
	 *
	 * @return the value of idMother
	 */
	java.math.BigDecimal getIdMother();

	/**
	 * Setter method for property : idMother (nullable: yes)
	 *
	 * Reference to mother
	 *
	 * @param value the value of idMother
	 */
	void setIdMother( java.math.BigDecimal value );

	/**
	 * Getter method for property : idFather (nullable: yes)
	 *
	 * Reference to fater
	 *
	 * @return the value of idFather
	 */
	java.math.BigDecimal getIdFather();

	/**
	 * Setter method for property : idFather (nullable: yes)
	 *
	 * Reference to fater
	 *
	 * @param value the value of idFather
	 */
	void setIdFather( java.math.BigDecimal value );

	/**
	 * Getter method for property : virtualNote (nullable: no)
	 *
	 * Virtual note
	 *
	 * @return the value of virtualNote
	 */
	java.lang.String getVirtualNote();

	/**
	 * Setter method for property : virtualNote (nullable: no)
	 *
	 * Virtual note
	 *
	 * @param value the value of virtualNote
	 */
	void setVirtualNote( java.lang.String value );

	/**
	 * Getter method for property : Mother (nullable: yes)
	 *
	 * relation to entity : PERSON
	 *
	 * @return the value of Mother
	 */
	ModelPerson getMother();

	/**
	 * Setter method for property : Mother (nullable: yes)
	 *
	 * relation to entity : PERSON
	 *
	 * @param value the value of Mother
	 */
	void setMother( ModelPerson value );

	/**
	 * Getter method for property : Father (nullable: yes)
	 *
	 * relation to entity : PERSON
	 *
	 * @return the value of Father
	 */
	ModelPerson getFather();

	/**
	 * Setter method for property : Father (nullable: yes)
	 *
	 * relation to entity : PERSON
	 *
	 * @param value the value of Father
	 */
	void setFather( ModelPerson value );

	/**
	 * Getter method for property : OwnedDocuments (nullable: yes)
	 *
	 * relation to entity : DOCUMENT
	 *
	 * @return the value of OwnedDocuments
	 */
	java.util.List<ModelDocument> getOwnedDocuments();

	/**
	 * Setter method for property : OwnedDocuments (nullable: yes)
	 *
	 * relation to entity : DOCUMENT
	 *
	 * @param value the value of OwnedDocuments
	 */
	void setOwnedDocuments( java.util.List<ModelDocument> value );

}
