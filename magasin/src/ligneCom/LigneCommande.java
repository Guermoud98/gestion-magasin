package ligneCom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import products.ConnectionDB;
import products.Produit;

public class LigneCommande {
	private Produit pro;
	private double qteVendu;
	private int idProFromDB;


	Connection conn = ConnectionDB.getConnexion();
	//constructor
	public LigneCommande(Produit pro, double qteVendu) {
		this.pro = pro;
		this.qteVendu = qteVendu;
		idProFromDB = pro.getIdProFromDB();
	}
	

		public LigneCommande() {
	
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
		
		public int getIdProFromDB() {
			return idProFromDB;
		}

		public void setIdProFromDB(int idProFromDB) {
			this.idProFromDB = idProFromDB;
		}


		@Override
		public String toString() {
			return "LigneCommande [qteVendu=" + qteVendu + ", idProduitFromDB=" + idProFromDB + "]";
		}

		
}
