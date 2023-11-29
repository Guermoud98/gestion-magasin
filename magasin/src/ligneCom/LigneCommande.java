package ligneCom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import products.ConnectionDB;
import products.Produit;

public class LigneCommande {
	private  int id;
	private static int nbr  = 0;
	private Produit pro;
	private double qteVendu;
	private int idProFromDB;
	Connection conn = ConnectionDB.getConnexion();
	//constructor
	public LigneCommande(Produit pro, double qteVendu) {
		nbr++;
		id = nbr;
		this.pro = pro;
		this.qteVendu = qteVendu;
		// Retrieve the id of a specific product and store its id in idProFromDB
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produit WHERE designation = ?");
			stmt.setString(1, pro.getDesignation());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				this.idProFromDB = rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getIdProFromDB() {
		return idProFromDB;
	}
	public void setIdProFromDB(int idProFromDB) {
		this.idProFromDB = idProFromDB;
	}
		//Getters & Setters
		public Produit getPro() {
			return pro;
		}

		public void setPro(Produit pro) {
			this.pro = pro;
		}

		public double getQteVendu() {
			return qteVendu;
		}

		public void setQteVendu(double qteVendu) {
			this.qteVendu = qteVendu;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}

		
		@Override
		public String toString() {
			return "LigneCommande [id=" + id + ", pro=" + pro.toString() + ", qteVendu=" + qteVendu + "]";
		}
}
