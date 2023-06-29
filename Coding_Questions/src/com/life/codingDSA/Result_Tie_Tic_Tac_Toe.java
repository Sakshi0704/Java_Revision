package com.life.codingDSA;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result_Tie_Tic_Tac_Toe {
	 public static void main(String args[] ) throws Exception {
	        //BufferedReader
	        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // String name = br.readLine();                // Reading input from STDIN
	        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        
	        Scanner sr = new Scanner(System.in);
	        List<String> list = new ArrayList<>();
	        while(sr.hasNext()){
	            list.add(sr.next());
	        }
	        //System.out.println(list);
	        int xCount=0,oCount=0;
	        for(int i=0;i<list.size();i++){
	            char[] ch = list.get(i).toCharArray();
	            for(int j=0;j<ch.length;j++){
	                if(ch[j]=='x'){
	                    xCount++;
	                }else{
	                    oCount++;
	                }
	            }
	        }
	        if(xCount>oCount){
	            System.out.println('x');
	        }
	        else{
	            System.out.println('o');
	        }
	    }
}
