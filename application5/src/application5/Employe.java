package application5;

public class Employe  {
	
	protected String nom;
    protected  String adresse;
    protected int identifiant;
	protected int salaire;
	
	/**
	 * 
	 */
	public Employe(String nom , String adresse , int identifiant) {
		super();
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.adresse = adresse;
		setIdentifiant(identifiant);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		if(identifiant>0) {
			this.identifiant = identifiant;
		}
			
	}
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		if(salaire<0) {
			salaire=0;
		}
		else {this.salaire = salaire;}
		
	}
	
	
	 @Override
	public String toString() {
		return "Employe [nom=" + nom + ", adresse=" + adresse + ", identifiant=" + identifiant + ", salaire=" + salaire
				+ "]";
	}


	class Salarie extends Employe{ 
		double salaire ;
		public Salarie(String nom, String adresse, int identifiant) {
			super(nom, adresse, identifiant);
			
			
			// TODO Auto-generated constructor stub 
			}

	}


	public void consulter() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		
	}

	/** 
	 * 
	 */
	      
}
