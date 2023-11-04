package magasin;
import java.util.*;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 1, 15);    
		Produit p1 = new Produit("MacBook",3,2000f,date);
		IProduitDaoImplement ip = new IProduitDaoImplement();
		ip.add(p1);
		ip.delete(2);
		
		
		}

	}


