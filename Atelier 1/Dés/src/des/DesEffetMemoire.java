package des;

public class DesEffetMemoire extends Des{
	
    public static int i=0;
    public static int r2=0;
	public DesEffetMemoire(String nom,int nbFaces) {
		super(nom);
		setNbFaces(nbFaces);
	}

	public int lancer() {
	    int resultat = super.lancer(); // Appel de la méthode lancer de la classe parente
	    
	    i++;
	    
	    if (i == 2) {
	        i--;
	        if (resultat == r2) {
	            do {
	                resultat = super.lancer();
	            } while (resultat == r2); // Répète l'appel jusqu'à obtenir un résultat différent
	        }
	    }
	    
	    r2 = resultat;
	    return resultat;
	}

	    
	    	

	    		

	    	
	    
	   

}
