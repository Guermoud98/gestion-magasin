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
	private int idClientDB;
	Connection conn = ConnectionDB.getConnexion();
	//constructor
	public Vente(LocalDate date, LigneCommande ligneCommande, Client cl) {
		this.date = date;
		this.ligneCommande = ligneCommande;
		this.cl = cl;
		this.idClientDB = cl.getIdClientDB();
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
	
	
	public Vente() {

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
	public int getIdclient() {
		return cl.getIdClientDB();
	}
	public int getIdLigneCommande() {
		return ligneCommande.getIdProFromDB()
	}
	public void setIdclient(int id) {
		cl = new Client();
		cl.setId(id);
	}
	public void setIdLigneCommande(int id) {
		ligneCommande = new LigneCommande();
		ligneCommande.setIdProFromDB(id);
	}


	@Override
	public String toString() {
		return "Vente [ligneCommandeId=" + ligneCommande.getIdProFromDB() + ", idClient=" + cl.getId() +"]";
	}
	
	
}
