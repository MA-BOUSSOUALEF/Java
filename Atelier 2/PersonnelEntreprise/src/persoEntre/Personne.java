package persoEntre;
import java.util.*;
public class Personne {

        public static int i=0; //pour compter le nombre des instances creer
	    private static final Adresse ADRESSE_INCONNUE = null;
	    private String nom;
	    private String prenom;
	    private final GregorianCalendar dateNaissance;
	    private Adresse adresse=ADRESSE_INCONNUE;
		
		/**
		 * Constructeur de Personne
		 * @param leNom le nom de la personne
		 * @param lePrenom le prénom de la personne
		 * @param laDate la date de naissance de la personne
		 * @param lAdresse l'adresse de la personne
		 */
		public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
			i++;
			nom = leNom.toUpperCase();
			prenom=lePrenom;
			dateNaissance=laDate;
			adresse=lAdresse;
		}
		
		/** 
		 * Constructeur de Personne
		 * @param leNom le nom de la personne
		 * @param lePrenom le prénom de la personne
		 * @param j le jour de naissance
		 * @param m le mois de naissance
		 * @param a l'année de naissance
		 * @param numero le n° de la rue
		 * @param rue la rue
		 * @param code_postal le code postal de l'adresse
		 * @param ville la ville ou la personne habite
		 */
		public Personne(String leNom,String lePrenom, int j, int m, int a, long numero, String rue, String code_postal, String ville){
			this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
			i++;
		}

		/**
		 * Accesseur
		 * @return retourne le nom
		 */
		public String getNom(){
			return nom;
		}
		/**
		 * Accesseur
		 * @return retourne le prénom
		 */
		public String getPrenom(){
			return prenom;
		}
		/**
		 * Accesseur
		 * @return retourne la date de naissance	 
		 */
		public GregorianCalendar getDateNaissance() {
			return dateNaissance;
		}
		/**
		 * Accesseur
		 * @return retourne l'adresse	 
		 */
		public Adresse getAdresse() {
			return adresse;
		}
		/**
		 * Modificateur
		 * @param retourne l'adresse	 
		 */
		public void setAdresse(Adresse a) {
			adresse=a;
		}
			
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		public String toString(){
			String result="\nNom : "+nom+"\n"
			+"Prenom : "+prenom+"\n"+
			"Nee(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
			"-"+dateNaissance.get(Calendar.MONTH)+
			"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
			"Adresse : "+
			adresse.toString();
			return result;
	}
     
	  public boolean plusAgeeQue(Personne p2) {
		  if(this.getDateNaissance().before(p2.getDateNaissance())) //p2 moins agee que personne courant
			  return true;
		  else 
			  return false;
	  }
      public static boolean plusAgee(Personne p1,Personne p2) {
		  if(p1.getDateNaissance().before(p2.getDateNaissance())) //p2 moins agee que p1
			  return true;
		  else 
			  return false;
	    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(dateNaissance, other.dateNaissance) && Objects.equals(nom, other.nom)
				&& Objects.equals(prenom, other.prenom);
	}

}
