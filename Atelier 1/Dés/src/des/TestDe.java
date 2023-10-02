package des;

public class TestDe {

	public static void main(String[] args) {
		Des de1=new Des();
		Des de2=new Des(7);
		Des de4=new Des(7);
		Des de3=new Des("Dés3");
//        System.out.println(de1.toString());
//        System.out.println(de3.toString());
//        int r=de1.lancer();
//        System.out.println(r);
//        System.out.println(de2.toString());
//        System.out.println(de4.toString());
//		System.out.println(de1.lancer(r));
//		System.out.println(de1.equals(de1));
//		DesPipes def5=new DesPipes("Des5",9,2);
//		System.out.println(def5.lancer());
//		DesEffetMemoire def6=new DesEffetMemoire("Des5",3);
//		System.out.println(def6.lancer())

		DesFaceAutre def6=new DesFaceAutre("Desf6");
		System.out.print(def6.lancerChaine());
		


		
		
	}

}
