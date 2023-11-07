package clients;

public interface IClientDao {
	public void add(Client cl);
	public Client search(int id);
	public void modify(int id);
	public void delete(int id);
	public Client getAll();
}
