CREATE TABLE GUITAR (
  id bigint NOT NULL UNIQUE,
  name VARCHAR(60) NOT NULL ,
  description VARCHAR(600),
  content blob,
  PRIMARY KEY (id)
);
