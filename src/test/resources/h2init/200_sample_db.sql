
CREATE TABLE daogen_quickstart.person (
	id BIGINT NOT NULL,
	surname VARCHAR(256) NOT NULL,
	name VARCHAR(256) NOT NULL,
	birth_date DATE NOT NULL,
	note VARCHAR(256) NOT NULL,
	id_mother BIGINT,
	id_father BIGINT
);

ALTER TABLE daogen_quickstart.person ADD CONSTRAINT person_pk PRIMARY KEY ( id );
ALTER TABLE daogen_quickstart.person ADD CONSTRAINT person_fk1 FOREIGN KEY ( id_mother ) REFERENCES person ( id );
ALTER TABLE daogen_quickstart.person ADD CONSTRAINT person_fk2 FOREIGN KEY ( id_father ) REFERENCES person ( id );

COMMENT ON TABLE daogen_quickstart.person IS 'People data';
COMMENT ON COLUMN daogen_quickstart.person.id IS 'Person id';
COMMENT ON COLUMN daogen_quickstart.person.surname IS 'Person surname';
COMMENT ON COLUMN daogen_quickstart.person.name IS 'Person name';
COMMENT ON COLUMN daogen_quickstart.person.birth_date IS 'Person birth date';
COMMENT ON COLUMN daogen_quickstart.person.note IS 'Notes on persone';
COMMENT ON COLUMN daogen_quickstart.person.id_mother IS 'Reference to mother';
COMMENT ON COLUMN daogen_quickstart.person.id_father IS 'Reference to fater';

INSERT INTO daogen_quickstart.person VALUES ( 1, 'Therinde', 'Miriel', '1900-01-01', 'First wife of Finwe', NULL, NULL ); 
INSERT INTO daogen_quickstart.person VALUES ( 2, 'Noldor', 'Finwe', '2000-01-01', 'Noldor king', NULL, NULL ); 
INSERT INTO daogen_quickstart.person VALUES ( 3, 'Noldor', 'Feanor', '2000-01-01', 'Great smith', 1, 2 ); 

CREATE TABLE daogen_quickstart.document (
	id BIGINT NOT NULL,
	id_owner BIGINT NOT NULL,
	id_creator BIGINT NOT NULL,
	creation_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	path VARCHAR(1024) NOT NULL,
	state BIGINT NOT NULL,
	info clob NOT NULL
);

ALTER TABLE daogen_quickstart.document ADD CONSTRAINT document_pk PRIMARY KEY ( id );
ALTER TABLE daogen_quickstart.document ADD CONSTRAINT document_fk1 FOREIGN KEY ( id_owner ) REFERENCES person ( id );
ALTER TABLE daogen_quickstart.document ADD CONSTRAINT document_fk2 FOREIGN KEY ( id_creator ) REFERENCES person ( id );

COMMENT ON TABLE daogen_quickstart.document IS 'Documents meta informations';
COMMENT ON COLUMN daogen_quickstart.document.id_owner IS 'Reference to owner';
COMMENT ON COLUMN daogen_quickstart.document.id_creator IS 'Reference to creator';
COMMENT ON COLUMN daogen_quickstart.document.creation_date IS 'Document creation time';
COMMENT ON COLUMN daogen_quickstart.document.update_date IS 'Document update time';
COMMENT ON COLUMN daogen_quickstart.document.path IS 'Documents path';
COMMENT ON COLUMN daogen_quickstart.document.info IS 'Documents info';
COMMENT ON COLUMN daogen_quickstart.document.state IS 'Document state';

INSERT INTO daogen_quickstart.document VALUES ( 10, 3, 1, '2019-01-01', '2019-01-02', 'Silmarillion', 1, 'TEST' );


CREATE TABLE daogen_quickstart.sample_map_table (
	id BIGINT NOT NULL,
	content VARCHAR(16) NOT NULL
);

ALTER TABLE daogen_quickstart.sample_map_table ADD CONSTRAINT sample_map_table_pk PRIMARY KEY ( id );

COMMENT ON TABLE daogen_quickstart.sample_map_table IS 'Sample table mapped with different name';
COMMENT ON COLUMN daogen_quickstart.sample_map_table.id IS 'Record id';
COMMENT ON COLUMN daogen_quickstart.sample_map_table.content IS 'Record content';

INSERT INTO daogen_quickstart.sample_map_table VALUES ( 1, 'Mapped table' ); 
