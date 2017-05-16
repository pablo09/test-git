CREATE TABLE PICKUP (
  ID bigint generated by default as identity,
  NAME VARCHAR(60) NOT NULL ,
  GUITAR_ID bigint,

  PRIMARY KEY (ID),
  FOREIGN KEY (GUITAR_ID) REFERENCES GUITAR(ID)
);