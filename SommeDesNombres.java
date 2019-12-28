package ateliersTableau;

public class SommeDesNombres {

	public static void main(String[] args) {
		int x= sommeDesNombres(3);
		System.out.println(x);
		

	}

	private static int sommeDesNombres(int i) {
		int x =0;
		for (int j=0; j<=i;j++) {
			x+=j;
		}

		
		return x;
	}

}
