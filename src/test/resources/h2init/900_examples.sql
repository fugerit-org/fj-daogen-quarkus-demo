
CREATE TABLE daogen_quickstart.example_01 (
	field1 VARCHAR(32) NOT NULL,
	field2 DATE NOT NULL,
	field3 VARCHAR(256)
);

ALTER TABLE daogen_quickstart.example_01 ADD CONSTRAINT example_01_pk PRIMARY KEY ( field1, field2 );

COMMENT ON TABLE daogen_quickstart.example_01 IS 'Example table 01 - If possible avoid multiple filed and/or dates in primary key';
COMMENT ON COLUMN daogen_quickstart.example_01.field1 IS 'First field of the primary key';
COMMENT ON COLUMN daogen_quickstart.example_01.field2 IS 'Second field of the primary key';
COMMENT ON COLUMN daogen_quickstart.example_01.field3 IS 'Unlinked third field';

INSERT INTO daogen_quickstart.example_01 VALUES ( 'test', '2019-01-01', 'unlinked field' );
