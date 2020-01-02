package fr.gtm.monopoly;

import java.util.Random;

public class De {
	private int valeur;
	private static Random random=new Random();

	public int getValeur() {
		return valeur;
	}
	public void lancer () {
		valeur = random.nextInt(6)+1;
	}

	
}
