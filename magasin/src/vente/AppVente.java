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
		imClient.add(c);
		//Produit
		LocalDate date = LocalDate.of(2021, 6, 7);   
		Produit p = new Produit("oppo",11,2000f,date);
		IProduitDaoImplement ipProduit = new IProduitDaoImplement();
		ipProduit.add(p);
		
		LigneCommande l = new LigneCommande(p, 2);
		ligneCom.ILigneCommandeImpelemnt im = new ligneCom.ILigneCommandeImpelemnt();
		im.add(l);
		//Vente v = new Vente(date, l, c);
		//IVenteDaoImplement im = new IVenteDaoImplement();
		//im.add(v);

		}

}
