package fr.gtm.monopoly;

public class Pion {

	private String nom;
	private Joueur joueur;
	private Case position;
	
	public Pion (String nom) {
		this.nom =nom;
	}
	
	public void setPosition(Case position) {
		this.position = position;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
