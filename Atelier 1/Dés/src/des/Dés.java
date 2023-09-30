package des;
import java.util.*;

public class Dés {
	private
	  String nom;
	  int nbFaces;
	 static Random r=new Random();
	static int i=0;
	public double getNbFaces() {
		return nbFaces;
	}
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	public String getNom() {
		return nom;
	}
	public Dés() {
		i++;
		nom="De";
		nbFaces=6;
	}
	public Dés(int nbFaces) {
		nom="n"+i;
		i++;
		if (3<=nbFaces && nbFaces<=120) {
			this.nbFaces=nbFaces;
		}
		else 
	        throw new IllegalArgumentException("La valeur doit être comprise entre 0 et 100.");

	}
	public Dés(String nom) {
		 if (nom != null && !nom.isEmpty()) {
		        this.nom = nom;
		    } else {
		        this.nom = "n"+i;  // Nom par défaut
		    }
			i++;

		}
	@Override
	public String toString() {
		return "Dés [nom=" + nom + ", nbFaces=" + nbFaces + "]";
	}
	public int lancer() {
		return r.nextInt(121);
	}
	public int lancer(int nb) {
		
		int val=3;
		for (int j=0;j<nb;j++) {
			int c=r.nextInt(121);
			if(val<c)
				val=c;
			}
		return val;
				
		}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
		
	
	
}
