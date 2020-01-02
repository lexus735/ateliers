package fr.gtm.game;

public class MainJeuDes {

	public static void main(String[] args) {
		JeuDes jeuDes=new JeuDes();
		
		Joueur j1 = new Joueur("Toto");
		Joueur j2 =new Joueur("Titi");
		
		
		jeuDes.ajouter(j1,j2);
		
		jeuDes.jouerPartie();

		System.out.println("le vainqueur est : " +jeuDes.getVainqueur().getNom());
	}

}
