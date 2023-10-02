package des;

public class DesPipes extends Des {

	private 
	     int born_min;
	
	
	public int getBorn_min() {
		return born_min;
	}
	
	public int lancer( ) {
		born_min=getBorn_min();
		return super.lancer(born_min);
	}
	public DesPipes(String nom,int nbFaces,int born_min) {
		super(nom);
		setNbFaces(nbFaces);
		if(born_min<=6 && born_min>=1)
		  this.born_min=born_min;
	}

}
