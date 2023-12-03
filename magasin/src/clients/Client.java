package clients;

import java.sql.*;

import products.ConnectionDB;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private String adresse;
	private int idClientDB;
	Connection conn = ConnectionDB.getConnexion();
	
	//constructor
	public Client(String nom, String prenom, String telephone, String email, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		//extracting the id of a specific client if it is already present in our DB.
		try {
			PreparedStatement stm = conn.prepareStatement("SELECT * FROM client");
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				this.idClientDB = rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Client() {}
	//getters & setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdClientDB() {
		return idClientDB;
	}
	public void setIdClientDB(int idClientDB) {
		this.idClientDB = idClientDB;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email="
				+ email + ", adresse=" + adresse + "]";
	}

	
	
	
	
	
}
