package magasin;
import java.util.*;
import java.sql.*;
import java.time.LocalDate;

public class IProduitDaoImplement implements IProduitDao {
	
	//constructor
	public IProduitDaoImplement() {}
	Connection conn= ConnectionDB.getConnexion();
	//adding a product
	public void add(Produit p) {
		try {
			Statement s = conn.createStatement();
		    s.executeUpdate("INSERT INTO produit(designation,qte,prix,date) VALUES ('"+p.getDesignation()+"','"+p.getQte()+"','"+p.getPrix()+"', '"+p.getDate()+"')");
		    System.out.println("Your product was successfully Added.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//deleting a specific product 
	public void delete(int id) {
		try {
			Statement s = conn.createStatement();
			s.executeUpdate("DELETE FROM produit WHERE id = '"+id+"'");
			System.out.println("Your product was successfully removed.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//displaying a specific product
	public Produit getOne(int id) {
		Produit p = null ;
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produit WHERE id = ?");
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				p = new Produit();
				p.setId(id);
				p.setDesignation(rs.getString("designation"));
				p.setQte(rs.getInt("qte"));
				p.setPrix(rs.getFloat("prix"));
				//Converting a java.util.Date to a LocalDate because the setDate method requires a LocalDate parameter.
				LocalDate d = rs.getDate("date").toLocalDate();
				p.setDate(d);
			}
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	public List<Produit> getAll() {
		List<Produit> products = new ArrayList<>();
		Produit p = null;
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produit");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				p = new Produit();
				p.setId(rs.getInt(1));
				p.setDesignation(rs.getString("designation"));
				p.setQte(rs.getInt("qte"));
				p.setPrix(rs.getFloat("prix"));
				//Converting a java.util.Date to a LocalDate because the setDate method requires a LocalDate parameter.
				LocalDate d = rs.getDate("date").toLocalDate();
				p.setDate(d);
				products.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
		
	}
	
	public List<Produit> getAll(String des){
		List<Produit> produits = new ArrayList<>();
		Produit p = null;
		try {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produit WHERE designation = ?");
			stmt.setString(1, des);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				p = new Produit();
				p.setId(rs.getInt(1));
				p.setDesignation(des);
				p.setQte(rs.getInt("qte"));
				p.setPrix(rs.getFloat("prix"));
				//Converting a java.util.Date to a LocalDate because the setDate method requires a LocalDate parameter.
				LocalDate d = rs.getDate("date").toLocalDate();
				p.setDate(d);
				produits.add(p);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produits;
	}
	

	

}
