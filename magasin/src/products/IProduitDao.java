package products;
import java.util.*;

public interface IProduitDao {
	//abstract methods
	public void add(Produit p);
	public void delete(int id);
	public Produit getOne(int id);
	public int isExistProduct(int id);
	public List<Produit> getAll();
	public List<Produit> getAll(String des);

}
