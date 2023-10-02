package Entier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManipEntier r=new ManipEntier(1,12,3);
		
//		r.incrementer();
//		System.out.print(r.toString());
//		r.incrementer(2);
//		System.out.print(r.toString());
		
		EntierFou r2=new EntierFou(2,16);
		r2.incremente();
		System.out.print(r2.getValeur());
	}

}
