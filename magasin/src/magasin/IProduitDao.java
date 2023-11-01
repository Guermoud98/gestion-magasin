package magasin;
import java.util.*;

public interface IProduitDao {
	
	public void add(Produit p);
	public void delete(long id);
	public Produit getOne(long id);
	public List<Produit> getAll();
	public List<Produit> getAll(String des);

}
