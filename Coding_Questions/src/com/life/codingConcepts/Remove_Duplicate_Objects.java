package com.life.codingConcepts;

public class Remove_Duplicate_Objects {

	public static void main(String args[]) {
		System.out.println("Studentsss class");
	}
	
}


class Studentsss{
    private int roll;
    private String name;
    private int marks;
    
    public Studentsss(){
        super();
    }
    
    public Studentsss(int roll, String name, int marks){
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public int hashCode(){
        return this.roll*2;
    }
    
        @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Studentsss)){
            return false;
        }
        Studentsss student = (Studentsss) obj;
        
        return student.getRoll() == this.getRoll();
    }
    
    public int getRoll(){
        return this.roll;
    }
    public String getName(){
        return this.name;
    }
    public int getMarks(){
        return this.marks;
    }
    
    public void setRoll(int roll){
         this.roll = roll;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setMarks(int marks){
        this.marks = marks;
    }
    
}