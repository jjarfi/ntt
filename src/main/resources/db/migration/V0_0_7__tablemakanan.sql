CREATE TABLE makanan (
id int (5) PRIMARY KEY,
nm_makanan VARCHAR (30) NOT NULL ,
deskripsi TEXT,
link TEXT,
createdate TIMESTAMP,
createdby int (5) NOT NULL,
FOREIGN KEY (createdby) REFERENCES admin (id)
ON UPDATE CASCADE
ON DELETE CASCADE,
suku int (5) NOT NULL,
FOREIGN KEY (suku) REFERENCES suku (id)
ON UPDATE CASCADE
ON DELETE CASCADE);