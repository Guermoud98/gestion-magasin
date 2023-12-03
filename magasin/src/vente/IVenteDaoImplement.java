package vente;
import java.sql.*;
import products.ConnectionDB;

public class IVenteDaoImplement implements IVenteDao {
	Connection conn = ConnectionDB.getConnexion();
	public IVenteDaoImplement() {} 
	PreparedStatement stm = null; 
	
	public void add(Vente v) {
		try {
			stm = conn.prepareStatement("INSERT INTO vente(idLigneCommande, idClient) VALUES (?,?)");
			//stm.setDate(1, v.getDate());
			stm.setInt(1, v.getIdLigneFromDB());
			stm.setInt(2, v.getCl().getIdClientDB());
			stm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		
		
	}
	
	

}
