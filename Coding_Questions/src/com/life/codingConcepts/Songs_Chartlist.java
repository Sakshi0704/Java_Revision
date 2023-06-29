package com.life.codingConcepts;

public class Songs_Chartlist {
	 public static void main(String str[]) {
		   System.out.println("Created song and chartlist class");
	   }
}


class song{
	  // complete the class as mentioned in the problem statement above
	  int duration;
	  String name;
	  int popularity;
	  
	  song(int duration,String name, int popularity){
	      this.duration = duration;
	      this.name = name;
	      this.popularity = popularity;
	  }
	  
	}


class chartlist{
	  // complete the class as mentioned in the problem statement above
	  int n;
	  song[] arr;
	  
	  public chartlist(int n, song[] arr){
	      this.n = n;
	      this.arr = arr;
	  }
	  
	  public void sortP(){
	      for(int i=0;i<arr.length;i++){
	          for(int j=0;j<arr.length;j++){
	              if(arr[i].popularity < arr[j].popularity){
	                  song temp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = temp;
	              }
	          }
	      }
	  }
	  
	  // in assending 
	  public void sortDuration(){
	      for(int i=0;i<arr.length;i++){
	          for(int j=0;j<arr.length;j++){
	              if(arr[i].duration < arr[j].duration){
	                  song temp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = temp;
	              }
	          }
	      }
	  }
	  
	  public String[] top_five(){
	      sortP();
	      String str[] = new String[5];
	      for(int i=0;i<5;i++){
	          str[i] = arr[i].name;
	      }
	      return str;
	  }
	  
	  public String leastPopular(){
	      sortP();
	      return arr[n-1].name;
	  }
	  
	  public String mostPopular(){
	      sortP();
	      return arr[0].name;
	  }
	  
	  public String longestSong(){
	      sortDuration();
	      return arr[n-1].name;
	  }
	  
	  public String shortestSong(){
	       sortDuration();
	      return arr[0].name;
	  }
	}
