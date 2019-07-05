package calc;

public class Calculatrice {

	public static int addition(int a,int b) {
		return a+b ;
	}

	public static int soustraction(int a, int b) {

		return a-b;
	}

	public static int multiplication(int a, int b) {

		return a*b;
	}

	public static int max(int a, int b) {
		int maxVal = 0;
		if(a>b) {
			maxVal = a;
		}else {
			maxVal = b;
		}
		return maxVal;
	}

	public static char signe(int a) {
		char resul = ' ';
		if (a >= 0) {
			resul = '+';
		}else {
			resul = '-';
		}

		return resul;
	}

	public static long factorielle(int parametreX) {

//		int facto = 1;
//		for (int i=1; i <= parametreX; i++){
//			facto = facto * i;
//	}
//		return facto;
		
//		if(parametreX == 0) {
//			return 1 ;
//		}else {
//			return (parametreX * factorielle (parametreX-1));
//		}
		
		int resultat = 1;
		int i = 1;
		while (i < parametreX) {
			System.out.println(i);
			i++;
			resultat = resultat * i;
		}
		return resultat;
	}

	public static boolean conjonction(boolean a, boolean b) {
		
		
		boolean c = a && b;
		return c;
		
	}

	public static boolean disjonction(boolean a, boolean b) {
		
		return a || b ;
	}

	public static boolean negation(boolean boolA) {
		
		return !boolA;
	}
		
	}




