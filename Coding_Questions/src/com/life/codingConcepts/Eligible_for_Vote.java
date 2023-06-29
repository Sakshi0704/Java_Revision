package com.life.codingConcepts;

public class Eligible_for_Vote {
	
	public static void main(String str[]) {
		System.out.println("Created on exception class and validation class which throwing the NotEligibleForVote exception");
	}
	
}


class NotEligibleForVote extends Exception{
    public NotEligibleForVote(String message){
        super(message);
    }
}


class Validation{
 
        public static void eligibleForVote(int age) throws NotEligibleForVote{
           System.out.println("start of method");  
            if(age>=18){
                System.out.println("You are Eligible for Vote.");
            }else{
                throw new NotEligibleForVote("You are not Eligible for Vote.");
            }
           System.out.println("end of method");
        }

}