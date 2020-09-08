package application5;

public class TestSalarie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe employe = new Employe("Djiby","Frankfurt",15);
		employe.consulter();
		
		Salarie salaire =new Salarie("JaFa", "Dakar", 50, 25000);
		salaire.consulter();

	}

}
