create table admin (
    id VARCHAR (200) NOT NULL PRIMARY KEY,
    nama VARCHAR (30) NOT NULL UNIQUE,
    email VARCHAR (30) NOT NULL UNIQUE,
    no_hp VARCHAR (12) NOT NULL UNIQUE,
    status BOOLEAN NOT NULL,
    username VARCHAR (30) NOT NULL UNIQUE,
    password VARCHAR (250) NOT NULL
);