package Api;
import java.text.DecimalFormat;
import java.util.Random;
public class TestApi {

	public static double pi = Math.PI;
	public static double r=Math.random(); 
	static Random random = new Random();
    DecimalFormat df = new DecimalFormat("0.00");
    String piFormat = df.format(pi);
    public static int nombreAleatoire = random.nextInt(3) + 1;
    static int x2=2;
	static int x1=1;
    public static int res=Math.max(x1,x2);
   static String n1 = "Banane";
   static  String n2 = "Avocat";
    int resultat = n1.compareTo(n2);
    public static void compare() {
    int resultat = n1.compareTo(n2);
    if (resultat < 0) {
        System.out.println(n1 + " vient avant " + n2 + " dans l'ordre alphabétique.");
    } else if (resultat > 0) {
        System.out.println(n2 + " vient avant " + n1 + " dans l'ordre alphabétique.");
    } else {
        System.out.println(n1 + " et " + n2 + " sont identiques dans l'ordre alphabétique.");
    }
}}
