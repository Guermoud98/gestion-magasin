package magasin;
import java.util.*;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, 6, 7);    
		Produit p1 = new Produit("oppo",11,2000f,date);
		IProduitDaoImplement ip = new IProduitDaoImplement();
		//ip.add(p1);
		//ip.delete(2);
		System.out.println(ip.getOne(7));
		System.out.println(ip.getAll());
		System.out.println(ip.getAll("hp"));
		
		}

	}


