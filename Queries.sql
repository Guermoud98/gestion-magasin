CREATE TABLE produit (
	id int PRIMARY KEY IDENTITY(1,1),
	designation varchar(20),
	qte int,
	prix float,
	date Date
);
USE gestionMagasin1;
INSERT INTO produit(designation,qte,prix) VALUES ('Iphone11',2,6000);
UPDATE produit SET date = '2023-04-7' WHERE id = 6;
SELECT * FROM produit;