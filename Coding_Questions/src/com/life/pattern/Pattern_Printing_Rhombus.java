package com.life.pattern;

import java.util.*;

public class Pattern_Printing_Rhombus {

	public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        
        for(int i=0;i<=n;i++){
            
            int num=0;
            for(int j=0;j<=n;j++){
                if(j>=n-i){ //0>=2-0=2
                    System.out.print(num+" "); // 0 
                    num++;
                }
                else{
                    System.out.print("  ");
                }
               
            }
            //System.out.print(num);
            num-=2;
            for(int j=n+1;j<=2*n;j++){
                if(j<=n+i){ //3<=2+0=4
                    System.out.print(num+" "); // 0 
                }
              num--;
            }
           
           System.out.println();
            
        }
       
       
       for(int i=n+1;i<=2*n;i++){
            
            int num=0;
            for(int j=0;j<=n;j++){
                if(j>=i-n){ //0>=2-0=2
                    System.out.print(num+" "); // 0 
                    num++;
                }
                else{
                    System.out.print("  ");
                }
               
            }
            //System.out.print(num);
            num-=2;
            for(int j=n+1;j<=2*n;j++){
                if(j>=n-i  && num>=0){ //3<=2+0=4
                    System.out.print(num+" "); // 0 
                }
              num--;
            }
           
           System.out.println();
            
        }
        
    }
	
}
