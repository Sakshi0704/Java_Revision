package com.life.pattern;

import java.util.*;

public class Pattern_of_W {

	 public static void main(String args[] ) throws Exception {
	        //BufferedReader
	        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // String name = br.readLine();                // Reading input from STDIN
	        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        
	        
	        Scanner sr = new Scanner(System.in);
	        int n = sr.nextInt();
	        
	        // i = 4 
	        // j = 16 
	        
	        
	        // i       j
	        // 1       1,8,9,16  ==> 1,9 \    ==> 8,16 / ==> 4*n+i-1
	        // 2       2,7,10,15  ==> 2,10     ==> 7,15  ==>4*n-1
	        // 3       3,6,11,14  ==> 3,11     ==> 6,14
	        // 4       4,5,12,13  ==> 4,12     ==> 5,13
	        // n                   == n,2*n+i  ==> 2*n+1-i,4*n-i+1;
	        
	        
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=4*n;j++){
	                if(j==i || j==2*n+i){
	                    System.out.print("\\");
	                }else if(j==2*n+1-i){
	                    System.out.print("/");
	                }else if(j==4*n+1-i){
	                    System.out.print("/");
	                     break;
	                }else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        
	    }
	
}
