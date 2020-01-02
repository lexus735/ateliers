package fr.gtm.monopoly;

public class Joueur {
	
	private String nom;
	private Pion pion;
	private int solde =1500;
	
	public Joueur (String nom) {
		this.nom=nom;
	} 
	
	public Pion getPion() {
		return pion;
	}
	public void setPion(Pion pion) {
		this.pion = pion;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void jouer(Gobelet gobelet) {
		gobelet.lancer();
	}
	

}
