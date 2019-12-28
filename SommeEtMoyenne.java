package projet1;

public class SommeEtMoyenne {
	public static void main(String[] args) {
	
		int a = 3;
		int b = 4;
		int c = 1;
		int d = 10;
		
		double m = moy(a,b,c,d);
		System.out.println ("la moyenne est égal à " +m);
		int s = sum(a,b,c,d);
		System.out.println("la somme es égal à " +s);	
	}

	private static int sum(int a, int b, int c, int d) {
		return (a+b+c+d);
	}

	private static double moy(int a, int b, int c, int d) {
		return (a+b+c+d)/4.0;
	}
}
