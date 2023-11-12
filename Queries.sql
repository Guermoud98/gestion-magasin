USE gestionMagasin1;
--produit 
CREATE TABLE produit (
	id int PRIMARY KEY IDENTITY(1,1),
	designation varchar(20),
	qte int,
	prix float,
	date Date
);
SELECT * FROM produit;
-- Client
CREATE TABLE Client (
    id int PRIMARY KEY IDENTITY(1,1),
	nom varchar(10),
	prenom varchar(15),
	telephone varchar(10),
	email varchar(20),
	adresse varchar(20)
);
SELECT * FROM client;
