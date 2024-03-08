package org.fugerit.java.daogen.quickstart.impl.struct;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import org.fugerit.java.core.db.daogen.StructMapper;
import org.fugerit.java.daogen.quickstart.def.model.ModelDocument;
import org.fugerit.java.daogen.quickstart.impl.helper.HelperDocument;
import org.fugerit.java.daogen.quickstart.impl.helper.WrapperDocument;

// custom import start ( code above here will be overwritten )
// custom import end ( code below here will be overwritten )

/**
 * ObjDocument, version : 1.0.0
 *
 * author: fugerit
 *
 * warning!: auto generated object, insert custom code only between comments :
 * // custom code start ( code above here will be overwritten )
 * // custom code end ( code below here will be overwritten )
 */
public class ObjDocument extends WrapperDocument implements SQLData, StructMapper {

	// custom code start ( code above here will be overwritten )
	// custom code end ( code below here will be overwritten )

	private static final long serialVersionUID = 681796005805L;

	public ObjDocument( ModelDocument wrapped ) {
		super( wrapped );
	}

	public ObjDocument() {
		this( new HelperDocument() );
	}

	public static final String SQL_TYPE_NAME = "OBJ_DOCUMENT";

	public static final ObjDocument MAPPER = new ObjDocument();

	@Override
	public Map<String, Class<?>> newTypeMapper() throws SQLException {
		Map<String, Class<?>> map = new HashMap<>();
		map.put( SQL_TYPE_NAME, ObjDocument.class );
		return map;
	}

	@Override
	public String getSQLTypeName() throws SQLException {
		return SQL_TYPE_NAME;
	}

	public static ObjDocument wrap( ModelDocument model ) {
		ObjDocument res = null;
		if ( model instanceof ObjDocument ) {
			res = (ObjDocument) model;
		} else { 
			res = new ObjDocument( model );
		}
		return res;
	}

	private transient java.sql.Clob infoClob;

	public void setInfoClob( java.sql.Clob value ) {
		this.infoClob = value;
	}

	public java.sql.Clob getInfoClob() {
		return this.infoClob;
	}

	private boolean areLobsSet = false;

	protected boolean checkLobs() {
		// lobs must be set, or lobs properties must be null for writeSQL() to work
		boolean check = this.areLobsSet;
		if ( !check ) {
			check = (this.getInfo() == null);
		}
		return check;
	}

	public void setupLobs( java.sql.Connection conn ) throws SQLException {
		setInfoClob( org.fugerit.java.core.db.daogen.LobHelper.createClob( conn, getInfo() ) );
		this.areLobsSet = true;
	}

	public static ObjDocument wrap( ModelDocument model, java.sql.Connection conn ) throws SQLException {
		ObjDocument res = wrap( model );
			res.setupLobs( conn );
		return res;
	}

	public static ObjDocument[] wrap( ModelDocument[] list, java.sql.Connection conn ) throws SQLException {
		ObjDocument[] res = null;
		if ( list != null ) {
			res = new ObjDocument[ list.length ];
			for ( int k=0; k<list.length; k++ ) {
				res[k] = wrap( list[k], conn );
			}
		}
		return res;
	}

	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.setId( stream.readBigDecimal() );
		this.setIdOwner( stream.readBigDecimal() );
		this.setIdCreator( stream.readBigDecimal() );
		this.setCreationDate( stream.readTimestamp() );
		this.setUpdateDate( stream.readTimestamp() );
		this.setPath( stream.readString() );
		this.setState( stream.readBigDecimal() );
		this.setInfo( org.fugerit.java.core.db.daogen.SQLTypeConverter.clobToCharHandler( (java.sql.Clob) stream.readObject() ) );
	}

	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		if ( !this.checkLobs() ) {
			org.fugerit.java.core.db.daogen.BasicHelper.throwUnsupported( "To use writeSQL() you must invoke setupLobs() for  "+this.getSQLTypeName() );
		}
		this.areLobsSet = false;	// clob and blob will be used only once
		stream.writeBigDecimal( this.getId() );
		stream.writeBigDecimal( this.getIdOwner() );
		stream.writeBigDecimal( this.getIdCreator() );
		stream.writeTimestamp( org.fugerit.java.core.db.daogen.SQLTypeConverter.utilDateToSqlTimestamp( this.getCreationDate() ) );
		stream.writeTimestamp( org.fugerit.java.core.db.daogen.SQLTypeConverter.utilDateToSqlTimestamp( this.getUpdateDate() ) );
		stream.writeString( this.getPath() );
		stream.writeBigDecimal( this.getState() );
		stream.writeClob( this.getInfoClob() );
	}

}
