CREATE TABLE SCHOOL.TEACHER (
  ID bigint generated by default as identity,
  FIRSTNAME VARCHAR2(40) NOT NULL,
  LASTNAME VARCHAR2(50) NOT NULL,

  PRIMARY KEY (ID)
);
