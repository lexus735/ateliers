package fr.gtm.game;

import java.util.ArrayList;
import java.util.List;

public class JeuDes {
	private List<Joueur> joueurs = new ArrayList<Joueur>();
	private Gobelet gobelet =new Gobelet();
	private Joueur vainqueur;
	
	public void ajouter (Joueur joueur) {
		joueurs.add(joueur);
	}

	//fonction variadique 
	
	public void ajouter (Joueur...joueurs) {
		for (Joueur joueur : joueurs) {
			this.joueurs.add(joueur);
		}
	}
	public void jouerPartie() {
		boolean fini = false;
		while (!fini) {
			for (Joueur joueur : joueurs) {
				joueur.jouer(gobelet);
				System.out.println(joueur.getNom()+ " obtient " +gobelet.getValeur());
				if(gobelet.isSame()) {
					fini =true;
					vainqueur =joueur;
					break;
				}
			}
		}
	}
	public Joueur getVainqueur() {
		return vainqueur;
	}
}

