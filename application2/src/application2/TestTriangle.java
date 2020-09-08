package application2;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle  P = new  Triangle(2 , 2 ,2);
		    Triangle.affiche();
		    Triangle.isEquilateral();
		    // 

		    if(Triangle.isEquilateral()) {
				
				System.out.println("Le triangle est equilateral");
			}else {System.out.println("Le triangle n'est pas equilateral"); }
			
		    

	}

}
