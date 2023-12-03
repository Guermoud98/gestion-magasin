package vente;
import java.sql.*;
import java.util.*;

import products.ConnectionDB;

public class IVenteDaoImplement implements IVenteDao {
	Connection conn = ConnectionDB.getConnexion();
	public IVenteDaoImplement() {} 
	PreparedStatement stmt = null; 
	ResultSet rs = null;
	Vente v = null;
	List<Vente> venteList = new ArrayList<Vente>();
	
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
	public List<Vente> display() {
		try {
			
			stmt = conn.prepareStatement("SELECT * FROM vente");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				v = new Vente();
				v.setIdclient(rs.getInt("idClient"));
				v.setIdLigneCommande(rs.getInt("idLigneCommande"));
				venteList.add(v);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return venteList;
	}
	public void modify(int id, int idLigneCommande) {
		try {
			stmt = conn.prepareStatement("UPDATE vente SET idLigneCommande = ? WHERE id = ?");
			stmt.setInt(1, id);
			stmt.setInt(2, idLigneCommande);
			stmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//public void delete(int id);
	public void delete(int id) {
		try {
			stmt = conn.prepareStatement("DELETE FROM vente WHERE id = ?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
			System.out.println("Sale Deleted!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
