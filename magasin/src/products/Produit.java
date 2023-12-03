package products;

import java.util.*;
import java.sql.*;
import java.time.LocalDate;

public class Produit {
	private int id;
	private static int nbr = 0;
	private String designation;
	private int qte;
	private float prix;
	private LocalDate date;
	private int idProFromDB;
	Connection conn = ConnectionDB.getConnexion();
	/* public Date(int year,
              int month,
              int date)
     */
	public Produit(String designation,int qte,float prix,LocalDate date) {
		this.designation = designation;
		this.qte = qte;
		this.prix = prix;
		this.date = date;
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produit Where designation = ?");
			stmt.setString(1,  designation);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				this.idProFromDB = rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Produit() {};
	
	//getters & setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public int getIdProFromDB() {
		return idProFromDB;
	}
	public void setIdProFromDB(int idProFromDB) {
		this.idProFromDB = idProFromDB;
	}
	@Override
	public String toString() {
		return "Produit [nbr=" + nbr + ", designation=" + designation + ", qte=" + qte + ", prix=" + prix + ", date="
				+ date + "]";
	}

	
	
	
	
}
