CREATE TABLE users (
    id BIGSERIAL,
    login VARCHAR(100) NOT NULL ,
	password VARCHAR(100) NOT NULL,
    CONSTRAINT pk_aircraft_models PRIMARY KEY (id)
);