package des;

public class TestDe {

	public static void main(String[] args) {

		Dés de1=new Dés();
		Dés de2=new Dés(7);
		Dés de4=new Dés(7);
		Dés de3=new Dés("Dés3");
        System.out.println(de1.toString());
        System.out.println(de3.toString());
        int r=de1.lancer();
        System.out.println(r);
        System.out.println(de2.toString());
        System.out.println(de4.toString());
		System.out.println(de1.lancer(r));
		System.out.println(de1.equals(de1));
	}

}
