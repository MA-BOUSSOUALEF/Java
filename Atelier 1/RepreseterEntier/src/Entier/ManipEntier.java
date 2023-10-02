package Entier;

import java.util.Objects;

public class ManipEntier {
	private 
	   int valeur=0;
	protected 
	 final int valMin,valMax;

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		if (valeur>valMin && valeur<valMax)
		this.valeur = valeur;
	}
	

	public ManipEntier(int valMin,int valMax) {
		if(valMin<valMax) {
		this.valMax=valMax;
		this.valMin=valMin;
		}
		else 
            throw new IllegalArgumentException("La borne minimale doit être inférieure ou égale à la borne maximale.");
        
	}
	 public ManipEntier(int valMin, int valMax, int valeur) {
	        this(valMin, valMax); // Appel du constructeur avec bornes par défaut
	        setValeur(valeur); // Utilisation de la méthode set pour initialiser la valeur
	    }
	public void incrementer() {
		int r=valeur+1;
		if (r<=valMax)
			setValeur(r);
	}
	public void incrementer(int n) {
		int r=valeur+n;
		if (r<=valMax)
			setValeur(r);
		}

	@Override
	public String toString() {
		return "ManipEntier [valeur=" + valeur + ", valMin=" + valMin + ", valMax=" + valMax + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManipEntier other = (ManipEntier) obj;
		return valMax == other.valMax && valMin == other.valMin && valeur == other.valeur;
	}
	
	
	
	   

}
