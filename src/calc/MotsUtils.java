package calc;

public class MotsUtils {

	 public static String inverser(String str) {
		 
		 int longueurMots = str.length();
		 
		 
		 String strf ="";
		 
		 
		 for (int i = 0; i < longueurMots; i++) {
			 
			strf = strf + str.charAt(longueurMots-i-1);
		}
		 
		return strf;
	 }
}
