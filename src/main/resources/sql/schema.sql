DROP TABLE IF EXISTS client;


CREATE TABLE client (
  ID    BIGSERIAL NOT NULL PRIMARY KEY,
  NAME  TEXT      NOT NULL,
  MODEL TEXT      NOT NULL
);

INSERT INTO client (NAME, MODEL) VALUES ('Kowalski', 'Punto');
INSERT INTO client (NAME, MODEL) VALUES ('Szatel', 'Megane');
INSERT INTO client (NAME, MODEL) VALUES ('Nowak', 'f150');
INSERT INTO client (NAME, MODEL) VALUES ('Lato', 'V5000');

select * from client;