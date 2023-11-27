package ligneCom;

public interface ILigneCommande {
	
	public void add(LigneCommande l);
	public double SousTotal(double prixVente, int qte);
	
}
