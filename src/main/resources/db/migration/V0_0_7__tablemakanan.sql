CREATE TABLE makanan (
 id VARCHAR (200) NOT NULL PRIMARY KEY,
nm_makanan VARCHAR (30) NOT NULL ,
deskripsi TEXT,
link TEXT,
createdate TIMESTAMP,
createdby VARCHAR (200) NOT NULL,
FOREIGN KEY (createdby) REFERENCES admin (id)
ON UPDATE CASCADE
ON DELETE CASCADE,
suku VARCHAR (200) NOT NULL,
FOREIGN KEY (suku) REFERENCES suku (id)
ON UPDATE CASCADE
ON DELETE CASCADE);