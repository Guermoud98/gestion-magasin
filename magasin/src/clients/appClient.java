package clients;

import java.util.*;

public class appClient {

	public static void main(String[] args) {
		Client c1 = new Client("maria","GUEM","0656789654","test2@gmail.com","QUARTIER ElWard");
		Client c3 = new Client("Hana","JAYLA","0544778899","test2@gmail.com","QUARTIER El Wed");
		Client c2 = new Client("Annie","NASSIM","0655445566","test3@gmail.com","QUARTIER El ZEN");
		Client c4 = new Client("Manel","VENEDY","0697664433","test6@gmail.com","QUARTIER El ROUGE");  
		Client c5 = new Client("Mimi","Yandi","0678665522","test7@gmail.com","QUARTIER El BLEU"); 
		IClientDaoImplement im = new IClientDaoImplement();
		//im.add(c1);
		//im.add(c2);
		//im.add(c3);
		//im.add(c4);
		im.add(c5);
		//search method
		System.out.println(im.search(3));
		//modify client's information
		im.modify(5, "0638997722", "test@test", "QUARTIEL EL HASSANI");
		//Delete a client based on its id
		//im.delete(5);
		//Displaying all clients
		im.getAll();
		
		

	}

}
