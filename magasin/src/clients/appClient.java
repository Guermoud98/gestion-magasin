package clients;

public class appClient {

	public static void main(String[] args) {
		Client c1 = new Client("maria","GUEM","0656789654","test2@gmail.com","QUARTIER ElWard");
		Client c3 = new Client("Hana","JAYLA","0544778899","test2@gmail.com","QUARTIER El Wed");
		Client c2 = new Client("Annie","NASSIM","0655445566","test3@gmail.com","QUARTIER El ZEN");
		Client c4 = new Client("Manel","VENEDY","0697664433","test6@gmail.com","QUARTIER El ROUGE");   
		IClientDaoImplement im = new IClientDaoImplement();
		//im.add(c1);
		//im.add(c2);
		//im.add(c3);
		//im.add(c4);
		//search method
		System.out.println(im.search(3));

	}

}
