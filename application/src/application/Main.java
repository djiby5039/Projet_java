package application;

public class Main {

	public static void main(String[] args) {
		
		Clavier clavier = new Clavier ();
		
		clavier.init();
		
		float [] reels = new float [5];
		for (int i = 0 ; i < reels.length ; i ++) {
			System.out.print ("Entrez un réel : ");
			reels[i] = clavier.lireFloat();
		}
		
		float moy = Main.moyenne(reels);
		System.out.println("La moyenne est : " + moy);
		
		moy = Main.moyenneArgsVariables(1, 5.0f, 3, 9);
		moy = Main.moyenneArgsVariables(1, 5.0f, 3);
		moy = Main.moyenneArgsVariables(1);
		moy = Main.moyenneArgsVariables();
		
		clavier.close();
	}
	
	public static float moyenne (float [] elements) { 
		
		float moyenne = 0;
		for (float element : elements) {
			moyenne += element;
		}
		moyenne /= elements.length;

		return moyenne;
	}
	
	public static float moyenneArgsVariables (float ... elements) { 
		
		float moyenne = 0;
		for (float element : elements) {
			moyenne += element;
		}
		moyenne /= elements.length;

		return moyenne;
	}
}

