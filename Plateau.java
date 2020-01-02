package fr.gtm.monopoly;

public class Plateau {
	
	private Case[] cases=new Case[40];
	
	public Plateau() {
		creerCase();
		lierCase();
	}

	public Case getCaseDepart() {
		return cases[0];
	}
	/**
	 * positionner la case suivante 
	 */
	
	private void lierCase() {
		for (int i=0; i<cases.length-1; i++) {
			cases [i].setSuivante(cases[i+1]);
		}
		cases[cases.length-1].setSuivante(cases[0]);
	}

	/**
	 * méthode chargée de créer les 40 cases
	 * le 40 éléments du plateau
	 * les cases sont nommées case 0, case 1...
	 */
	private void creerCase() {
		for (int i=0; i<cases.length; i++) {
			cases[i]=new Case();
			cases [i].setNom("cases" +i);
			
		}
		
	}
}
