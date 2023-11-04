package magasin;
import java.util.*;
import java.sql.*;

public class IProduitDaoImplement implements IProduitDao {
	
	//constructor
	public IProduitDaoImplement() {
		
	}

	Connection conn= ConnectionDB.getConnexion();

	
	public void add(Produit p) {
		try {
			Statement s = conn.createStatement();
		    s.executeUpdate("INSERT INTO produit(designation,qte,prix,date) VALUES ('"+p.getDesignation()+"','"+p.getQte()+"','"+p.getPrix()+"', '"+p.getDate()+"')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
