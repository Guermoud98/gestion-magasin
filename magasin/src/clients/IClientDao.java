package clients;

public interface IClientDao {
	public void add(Client cl);
	public Client search(int id);
	public void modify(int id, String telephone, String email, String adresse);
	public void delete(int id);
	//public Client getAll();
}
