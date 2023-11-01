CREATE TABLE produit (
	id int PRIMARY KEY IDENTITY(1,1),
	designation varchar(20),
	qte int,
	prix float,
	date Date
);
SELECT * FROM produit;