package com.life.pattern;

import java.util.*;

public class Pattern_Printing_X_Square {

	  public static void main(String args[] ) throws Exception {
	        //BufferedReader
	        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // String name = br.readLine();                // Reading input from STDIN
	        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        
	        Scanner sr = new Scanner(System.in);
	        int n = sr.nextInt();
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(i==0||i==n-1){
	                    System.out.print("* ");
	                }
	                else if(j==0 || j==n-1){
	                    System.out.print("* ");
	                }
	                else if(j==i || j==n-1-i){
	                    System.out.print("* ");
	                }
	                else{
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	        
	    }
	
}
