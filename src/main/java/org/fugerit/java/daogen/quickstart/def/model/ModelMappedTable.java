package org.fugerit.java.daogen.quickstart.def.model;

import org.fugerit.java.daogen.quickstart.impl.helper.HelperMappedTable;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ModelMappedTable, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
@org.fugerit.java.core.lang.annotate.DefineImpl(as = HelperMappedTable.class)
public interface ModelMappedTable extends org.fugerit.java.core.lang.compare.CheckEmpty {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	/**
	 * Getter method for property : id (nullable: no)
	 *
	 * Record id
	 *
	 * @return the value of id
	 */
	java.math.BigDecimal getId();

	/**
	 * Setter method for property : id (nullable: no)
	 *
	 * Record id
	 *
	 * @param value the value of id
	 */
	void setId( java.math.BigDecimal value );

	/**
	 * Getter method for property : content (nullable: no)
	 *
	 * Record content
	 *
	 * @return the value of content
	 */
	java.lang.String getContent();

	/**
	 * Setter method for property : content (nullable: no)
	 *
	 * Record content
	 *
	 * @param value the value of content
	 */
	void setContent( java.lang.String value );

}
