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
		Produit p2 = new Produit("MacBook2023", 30, 15000f, date);
		IProduitDaoImplement ipProduit = new IProduitDaoImplement();
		//ipProduit.add(p2);
		LigneCommande l = new LigneCommande(p2, 2);
		//System.out.println(l.getQteVendu());
		//System.out.println(c.getIdClientDB());
		//System.out.println(p.getId());
		//System.out.println(l.getPro());
		//System.out.println(l);
		ILigneCommandeImpelemnt im = new ILigneCommandeImpelemnt();
		//im.add(l);
		Vente v = new Vente(date, l, c);
		
		IVenteDaoImplement im2 = new IVenteDaoImplement();
		im2.add(v);
		System.out.println(im2.search(31));
		System.out.println(im2.display());
		im2.modify(29, 100);//doesn't work because we don't have in the LigneCommande table the id 100
		//im2.delete(33);
		}

}
