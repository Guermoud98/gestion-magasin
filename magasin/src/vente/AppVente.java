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
		//Produit
		LocalDate date = LocalDate.of(2023, 1, 1);   
		Produit p2 = new Produit("MacBook2020", 1, 10000f, date);
		IProduitDaoImplement ipProduit = new IProduitDaoImplement();
		//ipProduit.add(p);
		LigneCommande l = new LigneCommande(p2, 1);
		System.out.println(l.getIdProFromDB());
		//System.out.println(l.getIdLigneFromDB());
		//System.out.println(p.getId());
		//System.out.println(l.getPro());
		//System.out.println(l);
		ILigneCommandeImpelemnt im = new ILigneCommandeImpelemnt();
		im.add(l);
		Vente v = new Vente(date, l, c);
		
		IVenteDaoImplement im2 = new IVenteDaoImplement();
		im2.add(v);

		}

}
