package application5;

 class Salarie extends Employe  {
	 
	 private double salaire;
	 
	 

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		if(salaire < 0) {
			this.salaire = 0;
		}
		else {this.salaire = salaire;}
		
	}

   public Salarie(String nom, String adresse, int identifiant, double salaire) {
		super(nom, adresse, identifiant);
		// TODO Auto-generated constructor stub
		   this.salaire=salaire;
		   setSalaire(salaire);
	}

@Override
public String toString() {
	return "Salarie [salaire=" + salaire + "]";
}
      
   public void consulter() { super.consulter();
     System.out.println(super.toString() + "\n\t" +toString());
   }
}
