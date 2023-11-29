package ligneCom;

import java.sql.*;
import products.ConnectionDB;


public class ILigneCommandeImpelemnt implements ILigneCommande{
	Connection conn = ConnectionDB.getConnexion();
	
	public double SousTotal(double prixVente, int qte) {
		return prixVente*qte;
	}
	public void add(LigneCommande l) {
		PreparedStatement stm ;
		try {
			stm = conn.prepareStatement("INSERT INTO ligneCommande(qteVendu, idProduit) VALUES (?,?)");
			stm.setDouble(1, l.getQteVendu());
			stm.setInt(2, l.getIdProFromDB());
			stm.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}
