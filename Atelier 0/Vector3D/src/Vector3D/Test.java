package Vector3D;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Vecteur3D v1=new Vecteur3D(3,2,3);
		Vecteur3D v2=new Vecteur3D(3,2,3);

		v1.affiche();
		System.out.println();
		System.out.println(v1.norme());
		v1.somme(v2).affiche();		
		System.out.println();
		System.out.println(v1.produitScalaire(v2));		
		
	}

}
