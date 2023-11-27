package vente;
import clients.Client;
import ligneCom.LigneCommande;

import java.time.LocalDate;

public class Vente {
	private int id;
	private LocalDate date;
	private LigneCommande ligneCommande;
	private Client cl;
	//constructor
	public Vente(LocalDate date, LigneCommande ligneCommande, Client cl) {
		this.date = date;
		this.ligneCommande = ligneCommande;
		this.cl = cl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}
	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}
	public Client getCl() {
		return cl;
	}
	public void setCl(Client cl) {
		this.cl = cl;
	}
	public String toString() {
		return "[Vente n " + id + ": date : " + date + ", LigneCommandeId: " + ligneCommande.getId() + ", idClient" 
				+ cl.getId() + "]";
	}
	
}
