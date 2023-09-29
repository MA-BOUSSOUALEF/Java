package Robot;

public class Robot {
    
	private
		String refRobot;
	    String nom;
	    int x,y;
	    int orienter;
	    static int numeroRobot = 1;
	public final static int NORD=1;
	public final static int SUD=2;
	public final static int EST=3;
	public final static int OUEST=4;


	public Robot(String nom,int x,int y,int orienter) {
		this.x=x;
		this.y=y;
		this.orienter=orienter;
		this.nom=nom;
		refRobot="ROB"+numeroRobot;
		numeroRobot++;
	}
	
	public Robot(String nom) {
		this(nom, 2, 3,1);
//		refRobot="ROB"+numeroRobot;
//		numeroRobot++;
	}

	public void setOrienter(int orienter) {
		this.orienter = orienter;
	}
	public void Deplacer() {
		if (x>0 && y>0) {
		switch(orienter) {
		case 1:y++;break;
		case 2:y--;break;
		case 3:x--;break;
		case 4:x++;break;
		default :
			System.out.println("Orientation invalide");
            break;
		}}
		}
		
		public void afficheToi() {
			System.out.print("Nom :"+nom+"\n reference :"+refRobot+"\n x="+x+"\n y="+y+"\n direction="+orienter);
		}

		
		public String toString() {
			return "Robot [refRobot=" + refRobot + ", nom=" + nom + ", x=" + x + ", y=" + y + ", orienter=" + orienter
					+"]";
		}

		public String getRefRobot() {
			return refRobot;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

