package com.esmt.formation.java.run;

import com.esmt.formation.java.ObjectComparator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application application = new Application();
		 application.comparatorDemo(1, 2);
		

	}
	

   /*  public void run () {
  	  ObjectComparator<Integer> comparator = new ObjectComparator<Integer>(5 ,3);
  	  Integer max = comparator.getMax();
  	  Integer min = comparator.getMin();
  	  
  	  System.out.println("Le maximum est: '"+ max +  "et le minimum est: "+min);
  	  
    }
    */
	
	public <T extends Comparable<? super T>> void comparatorDemo(T objet1 , T objet2) {
		
		ObjectComparator<T> comparator =new ObjectComparator<>(objet1 , objet2); 
		
		try {
			T max = comparator.getMax();
			T min = comparator.getMin();
		}
		catch(){ }
	}


