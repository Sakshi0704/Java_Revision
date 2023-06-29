package com.life.codingConcepts;


import java.util.*;

public class Football_World_Cup {
	 public static void main(String str[]) {
		   System.out.println("Created Pair and footballWorldCup class");
	   }
}


class Pair implements Comparable<Pair>{
  int wins;
    String name;
    
    Pair(int wins, String name){
        this.wins = wins;
        this.name = name;
    }
    
    @Override
    public int compareTo(Pair p1){
        if(this.wins == p1.wins){
            return this.name.compareTo(p1.name);
        }
        return p1.wins - this.wins;
    }
    
   // write the constructor as mentioned in the problem statement
}

// class SortWinsAndName implements Comparator<Pair>{
    
//   @Override
//     public int compare(Pair p1, Pair p2){
//         if(p1.wins==p2.wins){
//             return p1.name.compareTo(p2.name);
//         }
//         return p2.wins-p1.wins;
//     }
    
// }


class footballWorldCup{
  int n = 32;
  Pair[] arr;
  
  
  footballWorldCup(Pair arr[]){
      this.arr = arr;
  }
  
  
  String[] topSixteen(){
    //   Arrays.sort(arr,new SortWinsAndName());
        
       Arrays.sort(arr);
    
      String str[] = new String[16];
      for(int i=0;i<16;i++){
          str[i] = arr[i].name;
      }
      return str;
  }
  
  
  String[] topEight(){
    //   Arrays.sort(arr,new SortWinsAndName());
    Arrays.sort(arr);
       String str[] = new String[8];
      for(int i=0;i<8;i++){
          str[i] = arr[i].name;
      }
      return str;
  }
  
  String[] topFour(){
    //   Arrays.sort(arr,new SortWinsAndName());
    Arrays.sort(arr);
       String str[] = new String[4];
      for(int i=0;i<4;i++){
          str[i] = arr[i].name;
      }
      return str;
  }
  
  
   String[] topTwo(){
    //   Arrays.sort(arr,new SortWinsAndName());
    Arrays.sort(arr);
       String str[] = new String[2];
      for(int i=0;i<2;i++){
          str[i] = arr[i].name;
      }
      return str;
  }
  
  
  String winner(){
    //   Arrays.sort(arr,new SortWinsAndName());
    Arrays.sort(arr);
      return arr[0].name;
  }
  // complete the class as mentioned in the problem statement
}
