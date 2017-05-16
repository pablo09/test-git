CREATE TABLE WOOD (
  guitar_id bigint NOT NULL UNIQUE,
  name VARCHAR(60) NOT NULL ,
  date DATE NOT NULL,

  PRIMARY KEY (guitar_id),
  FOREIGN KEY (guitar_id) REFERENCES GUITAR(ID)
);
