package com.life.pattern;
import java.util.*;


public class V_Pattern {
	  public static void main(String args[] ) throws Exception {
	        //BufferedReader
	        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // String name = br.readLine();                // Reading input from STDIN
	        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        
	        Scanner sr = new Scanner(System.in);
	        int n = sr.nextInt();
	        for(int i=0;i<n;i++){
	            for(int j=0;j<2*n;j++){
	                if(i==j){
	                    System.out.print("\\");
	                }
	                else if(j==2*n-1-i){
	                    System.out.print("/");
	                    break;
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        
	    }
}
