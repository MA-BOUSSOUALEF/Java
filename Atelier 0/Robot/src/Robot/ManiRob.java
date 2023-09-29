package Robot;

public class ManiRob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot r1=new Robot("Toto",10,20,Robot.SUD);
		Robot r2=new Robot("Titi",0,0,Robot.NORD);
		new Robot("Toto");
//		r1.Deplacer();
		System.out.println(r1.getRefRobot());
		System.out.println(r2.getRefRobot());

		r1.afficheToi();
		System.out.println(r1);
	}

}
