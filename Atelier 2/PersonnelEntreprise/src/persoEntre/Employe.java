package persoEntre;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe extends Personne{
 
	private
	 double salaire;
	 LocalDate date_embauche;
	 
	 public Employe(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville,double salaire,LocalDate date_embauche ) {
		 super(leNom,lePrenom,j,m,a,numero,rue,code_postal,ville);
		 this.salaire=salaire;
		 this.date_embauche=date_embauche;	 
	 }
	 
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Object createEmploye() {
	   long differenceEnYears = GregorianCalendar.getInstance().get(Calendar.YEAR)- getDateNaissance().get(Calendar.YEAR);
		if(differenceEnYears<16||differenceEnYears>65) {
			   return null;                  
		}
		return "l'Employe a ete bien creer";
	}
    public void augmenterLeSalaire(double pourcentage) {
        if (pourcentage > 0) { 
            double augmentation = (pourcentage / 100) * salaire;
            salaire += augmentation;
        } else {
            System.out.println("Le pourcentage doit être positif.");
        }
    }
    public int calculAnnuite() {
    	int nbrAnnee= GregorianCalendar.getInstance().get(Calendar.YEAR)- date_embauche.getYear();
    	return nbrAnnee;
    }

	
}
