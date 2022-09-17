-- 생성자 Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   위치:        2022-09-17 15:48:19 KST
--   사이트:      Oracle Database 11g
--   유형:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE buytbl (
    username         NCHAR(3) NOT NULL,
    prodname         NCHAR(3) NOT NULL,
    price            INTEGER NOT NULL,
    amount           INTEGER NOT NULL,
    usertbl_username NCHAR(3) NOT NULL
)
LOGGING;

CREATE TABLE usertbl (
    username  NCHAR(3) NOT NULL,
    birthyear INTEGER NOT NULL,
    addr      NCHAR(2) NOT NULL,
    mobile    VARCHAR2(12)
)
LOGGING;

ALTER TABLE usertbl ADD CONSTRAINT usertbl_pk PRIMARY KEY ( username );

ALTER TABLE buytbl
    ADD CONSTRAINT buytbl_usertbl_fk FOREIGN KEY ( usertbl_username )
        REFERENCES usertbl ( username )
    NOT DEFERRABLE;



-- Oracle SQL Developer Data Modeler 요약 보고서: 
-- 
-- CREATE TABLE                             2
-- CREATE INDEX                             0
-- ALTER TABLE                              2
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
