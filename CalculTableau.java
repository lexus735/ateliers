package ateliersTableau;

public class CalculTableau {

	public static void main(String[] args) {
		double [][] tab  = {
				{1.1,5.6},
				{2.6,6.9},
				{5.6,9.6,8.7},
				{1.2}
		};
		
		double [] resultats = new double [tab.length];
		calcul(tab,resultats);
		show(resultats);
		
		
	}

	private static void show(double[] resultats) {
		for (int k =0; k<resultats.length;k++) {
			System.out.print(resultats[k] +" ");
			
		}
		System.out.println(" ");
	}
	

	private static void calcul(double[][] tab, double[] resultats) {
		for (int i =0;i<tab.length;i++) {
			double x=0;
			for (int j =0;j<tab[i].length;j++) {
				x= x+tab[i][j];
				resultats[i]=x;
			}
		}
	}

}
