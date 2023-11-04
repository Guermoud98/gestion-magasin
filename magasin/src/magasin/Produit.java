package magasin;

import java.util.*;
import java.time.LocalDate;

public class Produit {
	private int id;
	private String designation;
	private int qte;
	private float prix;
	private LocalDate date;
	/* public Date(int year,
              int month,
              int date)
     */
	public Produit(String designation,int qte,float prix,LocalDate date) {
		this.designation = designation;
		this.qte = qte;
		this.prix = prix;
		this.date = date;
	}
	
	//getters & setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", qte=" + qte + ", prix=" + prix + ", date="
				+ date + "]";
	}
	
	
	
}
