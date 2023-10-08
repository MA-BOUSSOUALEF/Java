package persoEntre;

import java.time.LocalDate;
import java.util.ArrayList;

public class Secretaire extends Employe {
	
	ArrayList<Manager> manager;

	public Secretaire(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
			String ville, double salaire, LocalDate date_embauche,ArrayList<Manager> mang) {
		super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville, salaire, date_embauche);
		if(mang.size()<=5)
		 manager=mang;
		else 
			throw new IllegalArgumentException("une secretaire ne doit pas dépasser 5 Manager");
	}
	public void augmenterLeSalaire(double pourcentage) {
		  double salaire=getSalaire();
		  double salaireAug=(0.1/ 100)*manager.size();
	        if (pourcentage > 0) { 
	            double augmentation = ((pourcentage/100)+salaireAug) * salaire;
	            salaire += augmentation;
	            setSalaire(salaire);
	        } else {
	            System.out.println("Le pourcentage doit être positif.");
	        }
	    }
	public void AjouterManager(Manager man) {
		if( manager.size()<5)
		manager.add(man);
		else 
			throw new IllegalArgumentException("une secretaire ne doit pas dépasser 5 Manager");
	}
	public void SupprimerManager(Manager man) {
		manager.remove(man);
	}

}
