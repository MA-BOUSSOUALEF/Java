package Entier;

import java.util.Random;

public class EntierFou extends ManipEntier {
  protected int niveauDeFolie;
  public Random r=new Random();
	
	public EntierFou(int valeur,int niveauDeFolie) { //niveauDeFolie=valMax
		super(0,niveauDeFolie,valeur);
		this.niveauDeFolie=niveauDeFolie;
	}
	
	public void incremente() {
		int val=r.nextInt(niveauDeFolie)+1; //+1 car niveauDeFolie est exclus
		     int res=this.getValeur()+val;
		     this.setValeur(res);
		
	}
	
}
