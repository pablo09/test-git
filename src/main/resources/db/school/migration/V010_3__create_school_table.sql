CREATE TABLE SCHOOL.SCHOOL (
  ID bigint generated by default as identity,
  NAME VARCHAR2(100) not null,
  ADDRESS bigint /*not null*/,

  PRIMARY KEY (ID),
  FOREIGN KEY(ADDRESS) REFERENCES ADDRESS(ID)
);