package vente;
import clients.Client;
import ligneCom.LigneCommande;
import products.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Vente {
	private int id;
	private LocalDate date;
	private LigneCommande ligneCommande;
	private Client cl;
	private int idLigneFromDB;
	Connection conn = ConnectionDB.getConnexion();
	//constructor
	public Vente(LocalDate date, LigneCommande ligneCommande, Client cl) {
		this.date = date;
		this.ligneCommande = ligneCommande;
		this.cl = cl;
		//extracting the id of a specific ligneCommande if it is already present in our DB.
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM ligneCommande WHERE idProduit  = ?");
			stmt.setInt(1, ligneCommande.getIdProFromDB());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				this.idLigneFromDB = rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}
	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public int getIdLigneFromDB() {
		return idLigneFromDB;
	}
	public void setIdLigneFromDB(int idLigneFromDB) {
		this.idLigneFromDB = idLigneFromDB;
	}
	public String toString() {
		return "[Vente n " + id + ": date : " + date + ", LigneCommandeId: " + ligneCommande.getId() + ", idClient" 
				+ cl.getId() + "]";
	}
	
}
