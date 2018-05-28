package lanceur;

import domaine.PaireAvecGenericite;
import domaine.PaireSansGenericite;

public class MonApplication {

	public static void main(String[] args) {
		PaireSansGenericite paire1 = new PaireSansGenericite("abc", "xyz");
		String s1 = (String) paire1.getPremier();  // Le casting est obligatoire
		Double d1 = (Double) paire1.getSecond();   // Il faut attendre l'exécution pour avoir 
												  // une levée d'Exception (ClassCastException)
	
		PaireAvecGenericite<String> paire2 = new PaireAvecGenericite<String>("abc", "xyz");
				String s2 =  paire2.getPremier();   // Pas besoin de Casting
				//Double d2 = (Double) paire2.getSecond();     // Exception dès la compilation !
				
				
		System.out.println(s1);
		System.out.println(d1);
		System.out.println(s2);
		
		
	}
}
