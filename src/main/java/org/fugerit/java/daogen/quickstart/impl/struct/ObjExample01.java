package org.fugerit.java.daogen.quickstart.impl.struct;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import org.fugerit.java.core.db.daogen.StructMapper;
import org.fugerit.java.daogen.quickstart.def.model.ModelExample01;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperExample01;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperExample01;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ObjExample01, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class ObjExample01 extends WrapperExample01 implements SQLData, StructMapper {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 462638830510L;

	public ObjExample01( ModelExample01 wrapped ) {
		super( wrapped );
	}

	public ObjExample01() {
		this( new HelperExample01() );
	}

	public static final String SQL_TYPE_NAME = "OBJ_EXAMPLE_01";

	public static final ObjExample01 MAPPER = new ObjExample01();

	@Override
	public Map<String, Class<?>> newTypeMapper() throws SQLException {
		Map<String, Class<?>> map = new HashMap<>();
		map.put( SQL_TYPE_NAME, ObjExample01.class );
		return map;
	}

	@Override
	public String getSQLTypeName() throws SQLException {
		return SQL_TYPE_NAME;
	}

	public static ObjExample01 wrap( ModelExample01 model ) {
		ObjExample01 res = null;
		if ( model instanceof ObjExample01 ) {
			res = (ObjExample01) model;
		} else { 
			res = new ObjExample01( model );
		}
		return res;
	}

	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.setField1( stream.readString() );
		this.setField2( stream.readTimestamp() );
		this.setField3( stream.readString() );
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeString( this.getField1() );
		stream.writeTimestamp( org.fugerit.java.core.db.daogen.SQLTypeConverter.utilDateToSqlTimestamp( this.getField2() ) );
		stream.writeString( this.getField3() );
	}

}
