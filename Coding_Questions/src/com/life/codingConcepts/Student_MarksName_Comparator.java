package com.life.codingConcepts;

import java.util.Comparator;


public class Student_MarksName_Comparator {

	public static void main(String args[]) {
		System.out.println(" Student MarksName Comparator ");
	}

}


//Write you code here and Class name should be "Student" and "StudentMarksNameComparator" .
class Studentss{
	 int roll;
	 String name;
	 int marks;
	 
	 Studentss(int roll, String name, int marks){
	     this.roll = roll;
	     this.name = name;
	     this.marks = marks;
	 }
	 
	int getRoll(){
	    return this.roll;
	}
	
	String getName(){
	    return this.name;
	}
	
	int getMarks(){
	    return this.marks;
	}
	 
 
}

class StudentMarksNameComparator implements Comparator<Studentss>{
 @Override
 public int compare(Studentss s1, Studentss s2){
     int mark = s1.marks - s2.marks;
     if(mark!=0){
         return mark;
     }
     return s1.name.compareTo(s2.name);
 }
 
}
