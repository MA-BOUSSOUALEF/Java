package des;

import java.util.ArrayList;

public class DesFaceAutre extends Des {

	private ArrayList<String> faces;
	public DesFaceAutre(String nom) {
		
		super(nom);
		faces=new ArrayList<>();
		faces.add("Gagné");
        faces.add("Perdu");
        faces.add("Relancez");
        faces.add("Passez votre tour");		
	}
	
	public String lancerChaine() {
		
		int s=r.nextInt(faces.size());
		return faces.get(s);
	}
	
	
}
