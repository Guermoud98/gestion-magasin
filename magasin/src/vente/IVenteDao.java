package vente;

import java.util.*;

public interface IVenteDao {
	public void add(Vente v);
	public Vente search(int id);
	public List<Vente> display();
	public void modify(int idvente, int idLigneCommande);
	public void delete(int id);
	//public double TotalLigneCommande(List<LigneCommande> ligneC);
	//public boolean isExistLigneComm(LigneCommande ligneC);
	
	

}
