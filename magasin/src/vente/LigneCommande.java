package vente;
import products.Produit;

public class LigneCommande {
	private Produit pro;
	private double qteVendu;
	
	public double SousTotal(double prixVente, int qte) {
		return prixVente*qte;
	}
	
	

}
