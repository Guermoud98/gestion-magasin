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
--LigneCommande table
CREATE TABLE ligneCommande( 
    id int PRIMARY KEY IDENTITY(1,1),
	qteVendu float,
	idProduit int FOREIGN KEY REFERENCES produit(id)
);
SELECT * FROM ligneCommande;
-- vente table
CREATE TABLE vente (
    id int,
	date Date,
	idLigneCommande int FOREIGN KEY REFERENCES ligneCommande(id),
	idClient int FOREIGN KEY REFERENCES client(id)
);
SELECT * FROM vente;
