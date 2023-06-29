package com.life.codingConcepts;

import java.util.*;

public class T20_World_Cup_2022 {
	 public static void main(String str[]) {
		   System.out.println("Created Pair and worldCup class");
	   }
}


class Pairs{
	  // complete the class as mentioned in the problem statement
	  String name;
	  int points;
	  
	  Pairs(String name,int points){
	      this.name = name;
	      this.points = points;
	  }
	  
	  void print(){
	      System.out.println(this.name + "->" + this.points);
	  }
	  
	}

class worldCup{
	  // complete the class as mentioned in the problem statement
	  
	  int numberOfTeams;
	  Pairs arr[];
	  
	  worldCup(int numberOfTeams,Pairs arr[]){
	      this.numberOfTeams = numberOfTeams;
	      this.arr = arr;
	  }
	  
	  void sortList(){
	      Arrays.sort(arr,(a,b)->{
	          return b.points - a.points;
	      });
	  }
	  
	  void printLeaderBoard(){
	      sortList();
	      for(int i=0;i<numberOfTeams;i++){
	          arr[i].print();
	      }
	      
	  }
	  
	  String[] qualified(){
	       sortList();
	      String str[] = new String[2];
	      str[0] = arr[0].name;
	      str[1] = arr[1].name;
	      return str;
	  }
	  
	  String[] disqualified(){
	       sortList();
	      String str[] = new String[numberOfTeams-2];
	      for(int i=0;i<str.length;i++){
	          str[i] = arr[i+2].name;
	      }
	      return str;
	  }
	  
}