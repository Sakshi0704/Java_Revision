package com.life.codingConcepts;

public class Masai_Construction_System {
	  //Declare 2 overloaded methods for calculating total cost
	  //the total bill cost should be up to two decimal places
	  
	    
	    public void getTotalCost(double totalArea , double labourCharges){
	        double r = totalArea*labourCharges;
	         System.out.println("Your total bill is:" +String.format("%.2f",r));
	    }
	 
	    public void getTotalCost(double totalArea , double labourCharges, double materialCharges){
	        double r = totalArea*(labourCharges+materialCharges);
	         System.out.println("Your total bill is:" +String.format("%.2f",r));    
	    }
	  
}
