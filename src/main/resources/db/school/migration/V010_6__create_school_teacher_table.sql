CREATE TABLE SCHOOL.SCHOOL_TEACHER (
  SCHOOL_ID bigint not null,
  TEACHER_ID bigint not null,

  PRIMARY KEY (SCHOOL_ID, TEACHER_ID),

  FOREIGN KEY (SCHOOL_ID) REFERENCES SCHOOL(ID),
  FOREIGN KEY (TEACHER_ID) REFERENCES TEACHER(ID),
);