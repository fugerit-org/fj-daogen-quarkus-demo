package org.fugerit.java.daogen.quickstart.impl.struct;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import org.fugerit.java.core.db.daogen.StructMapper;
import org.fugerit.java.daogen.quickstart.def.model.ModelMappedTable;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperMappedTable;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperMappedTable;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ObjMappedTable, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class ObjMappedTable extends WrapperMappedTable implements SQLData, StructMapper {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 249457725154L;

	public ObjMappedTable( ModelMappedTable wrapped ) {
		super( wrapped );
	}

	public ObjMappedTable() {
		this( new HelperMappedTable() );
	}

	public static final String SQL_TYPE_NAME = "OBJ_MAPPED_TABLE";

	public static final ObjMappedTable MAPPER = new ObjMappedTable();

	@Override
	public Map<String, Class<?>> newTypeMapper() throws SQLException {
		Map<String, Class<?>> map = new HashMap<>();
		map.put( SQL_TYPE_NAME, ObjMappedTable.class );
		return map;
	}

	@Override
	public String getSQLTypeName() throws SQLException {
		return SQL_TYPE_NAME;
	}

	public static ObjMappedTable wrap( ModelMappedTable model ) {
		ObjMappedTable res = null;
		if ( model instanceof ObjMappedTable ) {
			res = (ObjMappedTable) model;
		} else { 
			res = new ObjMappedTable( model );
		}
		return res;
	}

	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.setId( stream.readBigDecimal() );
		this.setContent( stream.readString() );
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeBigDecimal( this.getId() );
		stream.writeString( this.getContent() );
	}

}
