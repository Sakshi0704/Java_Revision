package com.life.codingConcepts;

import java.util.HashSet;
public class HashSets_in_Java {

	public static void main(String args[]) {
		System.out.println("collections_in_java class");
	}
	
}

class collections_in_java{
  public HashSet<Integer> solve(int n,int[] arr){
    // complete the function as mentioned in the problem statement
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<n;i++){
        set.add(arr[i]);
    }
    return set;
  }
}
