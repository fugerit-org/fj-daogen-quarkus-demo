package org.fugerit.java.daogen.quickstart.impl.struct;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import org.fugerit.java.core.db.daogen.StructMapper;
import org.fugerit.java.daogen.quickstart.def.model.ModelPerson;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperPerson;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperPerson;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ObjPerson, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class ObjPerson extends WrapperPerson implements SQLData, StructMapper {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 94323375531L;

	public ObjPerson( ModelPerson wrapped ) {
		super( wrapped );
	}

	public ObjPerson() {
		this( new HelperPerson() );
	}

	public static final String SQL_TYPE_NAME = "OBJ_PERSON";

	public static final ObjPerson MAPPER = new ObjPerson();

	@Override
	public Map<String, Class<?>> newTypeMapper() throws SQLException {
		Map<String, Class<?>> map = new HashMap<>();
		map.put( SQL_TYPE_NAME, ObjPerson.class );
		return map;
	}

	@Override
	public String getSQLTypeName() throws SQLException {
		return SQL_TYPE_NAME;
	}

	public static ObjPerson wrap( ModelPerson model ) {
		ObjPerson res = null;
		if ( model instanceof ObjPerson ) {
			res = (ObjPerson) model;
		} else { 
			res = new ObjPerson( model );
		}
		return res;
	}

	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.setId( stream.readBigDecimal() );
		this.setSurname( stream.readString() );
		this.setName( stream.readString() );
		this.setBirthDate( stream.readTimestamp() );
		this.setNote( stream.readString() );
		this.setIdMother( stream.readBigDecimal() );
		this.setIdFather( stream.readBigDecimal() );
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeBigDecimal( this.getId() );
		stream.writeString( this.getSurname() );
		stream.writeString( this.getName() );
		stream.writeTimestamp( org.fugerit.java.core.db.daogen.SQLTypeConverter.utilDateToSqlTimestamp( this.getBirthDate() ) );
		stream.writeString( this.getNote() );
		stream.writeBigDecimal( this.getIdMother() );
		stream.writeBigDecimal( this.getIdFather() );
	}

}
