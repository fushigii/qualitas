CREATE TABLE SCORES 
(
  SCORE_ID INTEGER NOT NULL 
, METRIC VARCHAR2 (100) NOT NULL
, MEASURED_VALUE DOUBLE PRECISION NOT NULL 
, APPLIED_WEIGHT DOUBLE PRECISION NOT NULL 
, SCORE DOUBLE PRECISION NOT NULL 
, TRACE_ID INTEGER NOT NULL 
, CONSTRAINT SCORES_PK PRIMARY KEY 
  (
    SCORE_ID 
  )
  ENABLE 
);

ALTER TABLE SCORES
ADD CONSTRAINT SCORES_TRACES_FK1 FOREIGN KEY
(
  TRACE_ID 
)
REFERENCES TRACES
(
  TRACE_ID 
)
ENABLE;

CREATE INDEX SCORES_INDEX1 ON SCORES (TRACE_ID);

CREATE SEQUENCE SCORE_ID_SEQUENCE INCREMENT BY 1 START WITH 1 CACHE 20;