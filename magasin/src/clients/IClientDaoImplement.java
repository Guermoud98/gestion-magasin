package clients;
import java.sql.*;
import products.ConnectionDB;

public class IClientDaoImplement implements IClientDao {
	Connection conn = ConnectionDB.getConnexion();
	public void add(Client cl) {
		try {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO client(nom,prenom,telephone,email,adresse)"  
					 + "VALUES(?,?,?,?,?)");
			stmt.setString(1, cl.getNom());
			stmt.setString(2, cl.getPrenom());
			stmt.setString(3, cl.getTelephone());
			stmt.setString(4, cl.getEmail());
			stmt.setString(5, cl.getAdresse());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
