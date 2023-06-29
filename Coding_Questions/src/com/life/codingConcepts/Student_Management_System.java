package com.life.codingConcepts;
import java.util.*;

public class Student_Management_System {
	public static void main(String args[]) {
		System.out.println("Create StudentManagementApp class");
	}
}


//Write you code here and Class name should be "StudentManagementApp"

class StudentManagementApp{
 public List<Students> arr = new ArrayList<>();
 
 public void addStudent(Students student){
     int rollNo = student.getRollNo();
     if(rollNo<10 || rollNo>100){
         System.out.println("Please enter valid roll number");
         return;
     }
     
     for(int i=0;i<arr.size();i++){
         if(rollNo == arr.get(i).getRollNo()){
             System.out.println("Student is already present in the record");
             return;
         }
     }
     
     arr.add(student);
 }
 
 public void viewStudent(int rollNo){
     for(int i=0;i<arr.size();i++){
         if(rollNo == arr.get(i).getRollNo()){
             
             System.out.println("Student details");
             System.out.println("Roll No : "+arr.get(i).getRollNo());
             System.out.println("First Name : "+arr.get(i).getFirstName());
             System.out.println("Last Name : "+arr.get(i).getLastName());
             System.out.println("Date of Birth : "+arr.get(i).getDob());
             System.out.println("Email : "+arr.get(i).getEmail());
             System.out.println("Phone Number : "+arr.get(i).getPhoneNumber());
             System.out.println("City : "+arr.get(i).getCity());
             System.out.println("Gender : "+arr.get(i).getGender());
             
             return;
         }
     }
     System.out.println("Student is not present in the record");
 }
 
 public void deleteStudent(int rollNo){
     boolean flag = false;
     Students student = null;
      for(int i=0;i<arr.size();i++){
         if(rollNo == arr.get(i).getRollNo()){
             flag = true;
             student = arr.get(i);
             System.out.println("Student details");
             System.out.println("Roll No : "+arr.get(i).getRollNo());
             System.out.println("First Name : "+arr.get(i).getFirstName());
             System.out.println("Last Name : "+arr.get(i).getLastName());
             System.out.println("Date of Birth : "+arr.get(i).getDob());
             System.out.println("Email : "+arr.get(i).getEmail());
             System.out.println("Phone Number : "+arr.get(i).getPhoneNumber());
             System.out.println("City : "+arr.get(i).getCity());
             System.out.println("Gender : "+arr.get(i).getGender());
         }
     }
     if(flag){
         arr.remove(student);
     }else{
         System.out.println("Student is not present in the record");
     }
     
 }
 
 public void totalStudents(){
     System.out.println(arr.size());
 }
 
}




class Students{
	private int rollNo;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String phoneNumber;
	private String city;
	private String gender;
	
	
	
	public Students(int rollNo, String firstName, String lastName, String dob, String email, String phoneNumber,
			String city, String gender) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.gender = gender;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}