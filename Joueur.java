package fr.gtm.game;

public class Joueur {
	private String nom;

	public Joueur (String nom) {
		this.nom=nom;
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