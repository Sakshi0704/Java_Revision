package com.life.codingDSA;

public class Buying_Watches {

	 String getWatchPrice(String watchType, int age, String gender){  
		   //code to computer and return the price of watch up to two decimal  places 
		   
		    int discount = 0;
		    if(gender.equals("female")){
		        discount+=2; 
		    }
		    if(age>=60){
		        discount+=3;
		    }
		    
		    double amount = 0;
		    switch(watchType){
		        case "Titan":
		                amount = 7999 + (7999*(12.5+7.5))/100;
		                break;
		        case "Rolex" :
		                amount = 10999 + (10999*(13.5+12.5))/100;
		                break;
		        default :
		                break;
		    }
		    
		    amount = amount - (amount*discount)/100;
		    
		    String str = "The total bill amount is "+String.format("%.2f",amount);
		    
		    return str;
		   
		 } 
	
}
