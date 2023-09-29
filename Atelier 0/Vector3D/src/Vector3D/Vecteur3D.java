package Vector3D;
import java.lang.Math;
public class Vecteur3D {
	private 
	     double x,y,z;
	public Vecteur3D(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Vecteur3D() {
		this(0,0,0);
	}
	public void affiche() {
		System.out.print("<"+x+","+y+","+z+">");
	}

	public double norme() {
		 return Math.sqrt(x * x + y * y + z * z);
	}
	
	public double produitScalaire(Vecteur3D v) {
		return x*v.x+y*v.y+z*v.z;
	}
	public double produitScalaire(Vecteur3D v1,Vecteur3D v2) {
		return v2.x*v1.x+v2.y*v1.y+v2.z*v1.z;
	}
	public Vecteur3D somme(Vecteur3D v1) {
		double Vx=x+v1.x;
		double Vy=y+v1.y;
		double Vz=z+v1.z;
        return new Vecteur3D(Vx,Vy,Vz);
	} 
	public static Vecteur3D somme(Vecteur3D v1, Vecteur3D v2) {
        double newX = v1.x + v2.x;
        double newY = v1.y + v2.y;
        double newZ = v1.z + v2.z;
        return new Vecteur3D(newX, newY, newZ);
    }
}


