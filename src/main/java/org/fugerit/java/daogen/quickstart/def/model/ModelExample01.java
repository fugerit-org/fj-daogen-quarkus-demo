package org.fugerit.java.daogen.quickstart.def.model;

import org.fugerit.java.daogen.quickstart.impl.helper.HelperExample01;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ModelExample01, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
@org.fugerit.java.core.lang.annotate.DefineImpl(as = HelperExample01.class)
public interface ModelExample01 extends org.fugerit.java.core.lang.compare.CheckEmpty {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	/**
	 * Getter method for property : field1 (nullable: no)
	 *
	 * First field of the primary key
	 *
	 * @return the value of field1
	 */
	java.lang.String getField1();

	/**
	 * Setter method for property : field1 (nullable: no)
	 *
	 * First field of the primary key
	 *
	 * @param value the value of field1
	 */
	void setField1( java.lang.String value );

	/**
	 * Getter method for property : field2 (nullable: no)
	 *
	 * Second field of the primary key
	 *
	 * @return the value of field2
	 */
	java.time.LocalDate getField2();

	/**
	 * Setter method for property : field2 (nullable: no)
	 *
	 * Second field of the primary key
	 *
	 * @param value the value of field2
	 */
	void setField2( java.time.LocalDate value );

	/**
	 * Getter method for property : field3 (nullable: yes)
	 *
	 * Unlinked third field
	 *
	 * @return the value of field3
	 */
	java.lang.String getField3();

	/**
	 * Setter method for property : field3 (nullable: yes)
	 *
	 * Unlinked third field
	 *
	 * @param value the value of field3
	 */
	void setField3( java.lang.String value );

}
