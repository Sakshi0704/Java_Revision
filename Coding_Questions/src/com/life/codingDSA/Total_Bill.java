package com.life.codingDSA;

import java.util.*;

public class Total_Bill {
	 public static void main(String args[] ) throws Exception {
	        //BufferedReader
	        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // String name = br.readLine();                // Reading input from STDIN
	        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        
	        Scanner sr = new Scanner(System.in);
	        int tc = sr.nextInt();
	        while(tc-->0){
	            int n = sr.nextInt();
	            System.out.println(totalElBill(n));
	        }
	        
	    }
	    
	    public static int totalElBill(int n ){
	        if(n<=50){
	            return 80+3*n;
	        }else if(n<=150){
	            return 80+3*50+5*(n-50);
	        }else{
	            return 80+3*50+5*100+10*(n-150);
	        }
	    }
}
