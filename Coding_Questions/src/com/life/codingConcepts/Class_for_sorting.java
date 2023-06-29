package com.life.codingConcepts;
import java.util.Arrays;


public class Class_for_sorting {
	 public static void main(String str[]) {
		   System.out.println("Created sorter_class");
	   }
}


class sorter_class{
	  // complete the class as mentioned in the problem statemenent above
	  
	    
	    public void sort(String[] arr){
	        Arrays.sort(arr);
	    }
	  
	    public void sort(int[] arr){
	        Arrays.sort(arr);
	    }
	  
	    public void sort(char[] arr){
	        Arrays.sort(arr);
	    }
	    
	    public void sort(boolean[] arr){
	        for(int i=0;i<arr.length;i++){
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]==false && arr[j]==true){
	                    arr[i] = true;
	                    arr[j] = false;
	                }
	            }
	        }
	    }
	    
	}