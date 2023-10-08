package persoEntre;

import java.time.LocalDate;

public class Manager extends Employe {
	Secretaire secretaire;
	public Manager(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
			String ville, double salaire, LocalDate date_embauche,Secretaire secre) {
		super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, salaire, date_embauche);
		secretaire=secre;
	}
	

	  public Secretaire getSecretaire() {
		return secretaire;
	}


	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}


	public void augmenterLeSalaire(double pourcentage) {
		  double salaire=getSalaire();
		  double salaireAug=(0.5/ 100)*calculAnnuite();
	        if (pourcentage > 0) { 
	            double augmentation = ((pourcentage / 100)+salaireAug) * salaire;
	            salaire += augmentation;
	            setSalaire(salaire);
	        } else {
	            System.out.println("Le pourcentage doit être positif.");
	        }
	    }
}
