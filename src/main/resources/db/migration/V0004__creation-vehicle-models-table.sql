CREATE TABLE vehicles (
    id BIGSERIAL,
    brand VARCHAR(100) NOT NULL ,
	model VARCHAR(100) NOT NULL,
	year INTEGER NOT NULL,
	value INTEGER NOT NULL,

    CONSTRAINT pk_vehicles_models PRIMARY KEY (id)
);