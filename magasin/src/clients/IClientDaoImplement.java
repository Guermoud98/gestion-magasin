package clients;
import java.sql.*;
import java.util.*;

import products.ConnectionDB;

public class IClientDaoImplement implements IClientDao {
	Connection conn = ConnectionDB.getConnexion();
	PreparedStatement stmt = null;
	Client cl = null;
	public void add(Client cl) {
		try {
			stmt = conn.prepareStatement("INSERT INTO client(nom,prenom,telephone,email,adresse)"  
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
	public Client search(int id) {
		try {
			stmt = conn.prepareStatement("SELECT * FROM client WHERE id = ? ");
			stmt.setInt(1, id);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				cl = new Client();
				cl.setId(rs.getInt("id"));
				cl.setAdresse(rs.getString("adresse"));
				cl.setEmail(rs.getString("email"));
				cl.setNom(rs.getString("nom"));
				cl.setPrenom(rs.getString("prenom"));
				cl.setTelephone(rs.getString("telephone"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cl;
	}
	public void modify(int id, String telephone, String email, String adresse) {
		try {
			stmt = conn.prepareStatement("UPDATE client SET telephone = ?, email = ?, adresse = ? WHERE id = ?");
			stmt.setString(1, telephone);
			stmt.setString(2, email);
			stmt.setString(3, adresse);
			stmt.setInt(4, id);
			stmt.executeUpdate();
			System.out.println("Modified!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(int id) {
		try {
			stmt= conn.prepareStatement("DELETE FROM client WHERE id = ? ");
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Deleted!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void getAll() {
		try {
			stmt = conn.prepareStatement("SELECT * FROM client");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("[id: " + rs.getInt("id") + ", nom: " + rs.getString("nom") +
						", prenom: " + rs.getString("prenom") + ", adresse: " + rs.getString("adresse")+ 
						", email: " + rs.getString("email") + ", telephone : " + rs.getString("telephone") + "]");
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
