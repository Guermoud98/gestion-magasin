package ligneCom;

import java.sql.*;
import products.ConnectionDB;


public class ILigneCommandeImpelemnt implements ILigneCommande{
	Connection conn = ConnectionDB.getConnexion();
	
	public double SousTotal(double prixVente, int qte) {
		return prixVente*qte;
	}
	public void add(LigneCommande l) {
		PreparedStatement stmt ;
		try {
			stmt = conn.prepareStatement("INSERT INTO ligneCommande(qteVendu, idProduit, sousTotal) VALUES (?,?,?)");
			stmt.setDouble(1, l.getQteVendu());
			stmt.setInt(2, l.getIdProFromDB());
			stmt.setDouble(3, l.getQteVendu()*l.getPro().getPrix());
			stmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
