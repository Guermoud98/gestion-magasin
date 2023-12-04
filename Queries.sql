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
UPDATE produit SET designation = 'Iphone13' WHERE id = 4;
DELETE FROM produit WHERE  id  = 20;
-- Client
CREATE TABLE Client (
    id int PRIMARY KEY IDENTITY(1,1),
	nom varchar(10),
	prenom varchar(15),
	telephone varchar(10),
	email varchar(20),
	adresse varchar(20)
);
SELECT * FROM Client;
DELETE FROM Client WHERE  id  = 8;
--LigneCommande table
CREATE TABLE ligneCommande( 
    id int PRIMARY KEY IDENTITY(1,1),
	qteVendu float,
	idProduit int FOREIGN KEY REFERENCES produit(id)
);
INSERT INTO ligneCommande(qteVendu, idProduit) VALUES (12, 3); --3 c'est l'id du macBook 
SELECT * FROM ligneCommande;
DELETE from ligneCommande WHERE id = 62;
-- vente table
CREATE TABLE vente (
    id int PRIMARY KEY IDENTITY(1,1),
	date Date,
	idLigneCommande int FOREIGN KEY REFERENCES ligneCommande(id),
	idClient int FOREIGN KEY REFERENCES Client(id)
);
INSERT INTO vente(date, idLigneCommande, idClient) VALUES ('2022-01-08', 1, 1);
SELECT * FROM vente;
DELETE from vente WHERE id = 23;
-- voici une requête SQL qui récupère les produits d'un client spécifique 
SELECT p.qte, p.prix, c.nom, c.prenom, l.qteVendu from produit p 
JOIN ligneCommande l ON l.idProduit=p.id
JOIN vente v on v.idLigneCommande=l.id
JOIN Client c on c.id=v.idClient

