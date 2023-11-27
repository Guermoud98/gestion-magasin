package ligneCom;

import products.Produit;

public class LigneCommande {
	private int id;
	private Produit pro;
	private double qteVendu;
	//constructor
	public LigneCommande(Produit pro, double qteVendu) {
		this.pro = pro;
		this.qteVendu = qteVendu;
	}
	//Getters & Setters
		public Produit getPro() {
			return pro;
		}

		public void setPro(Produit pro) {
			this.pro = pro;
		}

		public double getQteVendu() {
			return qteVendu;
		}

		public void setQteVendu(double qteVendu) {
			this.qteVendu = qteVendu;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
}
