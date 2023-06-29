package com.life.codingConcepts;

import java.util.*;

public class Masai_Employee {
	public static void main(String args[]) {
		System.out.println("created Employees class which implements also Comparable interface");
	}
}


class Employees implements Comparable<Employees>{
    int id;
    String name;
    String city;
    
    Employees(int id, String name, String city){
       this.id = id;
       this.name = name;
       this.city = city;
    }
    
    
    int getId(){
        return this.id;
    }
    
    String getName(){
        return this.name;
    }
    
    String getCity(){
        return this.city;
    }

	@Override
	public int compareTo(Employees o) {
		return this.id - o.id; 
	}
    
}