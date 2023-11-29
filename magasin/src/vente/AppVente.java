package vente;
import java.time.LocalDate;
import clients.Client;
import clients.IClientDaoImplement;
import ligneCom.LigneCommande;
import ligneCom.ILigneCommandeImpelemnt;
import products.IProduitDaoImplement;
import products.Produit;

public class AppVente {

	public static void main(String[] args) {
		//Client
		Client c = new Client("Mona","Lee","0677899669","test8@gmail.com","QUARTIER El NOIR"); 
		IClientDaoImplement imClient = new IClientDaoImplement();
		//imClient.add(c);
		//Produit
		LocalDate date = LocalDate.of(2022, 3, 7);   
		//Produit p = new Produit("iphone",2,6000f,date);
		//Produit p1 = new Produit("ipad",2,12000f,date);
		Produit p2 = new Produit("MacBook2022",2,12000f,date);
		IProduitDaoImplement ipProduit = new IProduitDaoImplement();
		//ipProduit.add(p);
		LigneCommande l = new LigneCommande(p2, 2);
		//System.out.println(p1.getId());
		//System.out.println(p.getId());
		//System.out.println(l.getPro());
		//System.out.println(l);
		ligneCom.ILigneCommandeImpelemnt im = new ligneCom.ILigneCommandeImpelemnt();
		im.add(l);
		//Vente v = new Vente(date, l, c);
		//IVenteDaoImplement im = new IVenteDaoImplement();
		//im.add(v);

		}

}
