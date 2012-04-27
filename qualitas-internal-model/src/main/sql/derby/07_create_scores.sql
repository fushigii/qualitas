CREATE TABLE APP.SCORES (SCORE_ID BIGINT NOT NULL, APPLIED_WEIGHT REAL NOT NULL, MEASURED_VALUE REAL NOT NULL, METRIC VARCHAR(100) NOT NULL, SCORE REAL NOT NULL, TRACE_ID BIGINT NOT NULL, PRIMARY KEY (SCORE_ID));

ALTER TABLE APP.SCORES ADD CONSTRAINT FK_SCORES_TRACE_ID FOREIGN KEY (TRACE_ID) REFERENCES APP.TRACES (TRACE_ID);

CREATE INDEX SCORES_INDEX1 ON APP.SCORES (TRACE_ID);

CREATE SEQUENCE APP.SCORE_ID_SEQUENCE START WITH 1;