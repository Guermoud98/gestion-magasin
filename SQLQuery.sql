CREATE TABLE produit (
	id long PRIMARY KEY IDENTITY(1,1),
	designation varchar(20),
	qte int,
	prix double,
	date Date
);