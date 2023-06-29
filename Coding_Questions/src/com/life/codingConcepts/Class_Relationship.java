package com.life.codingConcepts;

public class Class_Relationship {
	
	public static void main(String args[]) {
		System.out.println("Created User and Customer class which extend User");
	}
	
}

class User{

    String city;
    String state;
    int pincode;
    
    
    public User(String city,String state,int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public String getState(){
        return this.state;
    }
    
    public int getPincode(){
        return this.pincode;
    }
    
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setState(String state){
        this.state= state;
    }
    
    public void setPincode(int pincode){
        this.pincode = pincode;
    }

}
class Customer extends User{

    String name;
    String email;
    int mobileNum;
    
    
    public Customer(String city , String state , int pincode, String name,String email,int mobileNum){
        super(city,state,pincode);
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
    }
    
     public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public int getMobileNum(){
        return this.mobileNum;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email= email;
    }
    
    public void setMobileNum(int mobileNum){
        this.mobileNum = mobileNum;
    }
    
    

}