package products;
import java.util.*;

public interface IProduitDao {
	//abstract methods
	public void add(Produit p);
	public void delete(long id);
	public Produit getOne(long id);
	public List<Produit> getAll();
	public List<Produit> getAll(String des);

}
