package vente;
import java.sql.*;
import products.ConnectionDB;

public class IVenteDaoImplement implements IVenteDao {
	Connection conn = ConnectionDB.getConnexion();
	public IVenteDaoImplement() {} 
	PreparedStatement stmt = null; 
	ResultSet rs = null;
	Vente v = null;
	
	public void add(Vente v) {
		try {
			stmt = conn.prepareStatement("INSERT INTO vente(idLigneCommande, idClient) VALUES (?,?)");
			//stm.setDate(1, v.getDate());
			stmt.setInt(1, v.getIdLigneFromDB());
			stmt.setInt(2, v.getCl().getIdClientDB());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	public Vente search(int id) {
		try {
			v = new Vente();
			stmt = conn.prepareStatement("SELECT * from vente where id = ?");
			stmt.setInt(1, id);
			 rs = stmt.executeQuery();
			 while(rs.next()) {
				 v.setId(rs.getInt("id"));
				 v.setIdclient(rs.getInt("idClient"));
				 v.setIdLigneCommande(rs.getInt("idLigneCommande"));
			 }
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return v;
	}
	
	

}
