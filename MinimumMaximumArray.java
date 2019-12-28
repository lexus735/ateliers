package ateliersTableau;

public class MinimumMaximumArray {

	public static void main(String[] args) {
 
		double [] tab = {10.0, 7.6, 1.1, 2.2, 3.3, 9.3, 4.4, 5.5};
		double min = minimum(tab);
		double max = maximum(tab);
		System.out.println("le minimum est : " +min);
		System.out.println("le maximum est : " +max);
		
	}

	private static double maximum(double[] tab) {
		double x =tab [0];
		for (int i=0;i<tab.length;i++) {
			if (x <tab[i]) {
				x= tab[i];
			}
		
			}
		
		return x;
	}

	private static double minimum(double[] tab) {
		double y=tab[0];
		for (int j=0;j<tab.length;j++) {
			if(y>tab[j]) {
				y=tab[j];
			}
		}
		
		return y;
	}

}
