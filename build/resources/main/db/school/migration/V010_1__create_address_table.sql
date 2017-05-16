CREATE TABLE SCHOOL.ADDRESS (
  ID bigint generated by default as identity,
  COUNTRY VARCHAR2(40) NOT NULL,
  CITY VARCHAR2(50) NOT NULL,
  STREET VARCHAR2(50) NOT NULL,
  PRIMARY KEY (ID)
);