package com.life.codingConcepts;


import java.util.Arrays;

public class Running_a_Company {
   public static void main(String str[]) {
	   System.out.println("Created employee and compnay class");
   }
}


class Employee{
  // complete the class as mentioned in the problem statement

    int employee_id;
    String name;
    int salary;
    boolean stock_options;
    int vesting_period;
    
    
    public Employee(int id, String n, 
        int s, boolean so, int vp){
        employee_id = id;
        name = n;
        salary = s;
        stock_options = so;
        vesting_period = vp;
    }
    
    
    public int employeeNumber(){
        return this.employee_id;
    }  
    
    public String name(){
        return this.name;
    }
    
    public int salary(){
        return this.salary;
    }
    
    public boolean stock_options(){
        if(stock_options){
           return true;
        }
        return false;
    }
    
    public int vesting_period(){
        return vesting_period;
    }
    
}

class company{
  // complete the class as mentioned in the problem statement
  
     int size;
     Employee[] arr;
     
     
     public company(int size, Employee arr[]){
         this.size = size;
         this.arr = arr;
     }
  
    void sortSalary(){
        Arrays.sort(arr,(s1,s2)->{
            return s1.salary - s2.salary;
        });
    }
    
    void sortEmployeeId(){
        Arrays.sort(arr,(s1,s2)->{
           return s1.employeeNumber() - s2.employeeNumber(); 
        });
    }
    
    void sortVestingPeriod(){
        Arrays.sort(arr,(s1,s2)->{
            return s2.vesting_period() - s1.vesting_period();
        });
    }
    
    void stockOrNot(int id){
        for(int i=0;i<size;i++){
            if(arr[i].employeeNumber() == id){
                if(arr[i].stock_options()){
                    System.out.println("Stock Granted to "+arr[i].name());
                }else{
                    System.out.println("Stock not Granted to "+arr[i].name());
                }
                return;
            }
        }
        System.out.println("Invalid Employee ID");
    }
    
    int size(){
        return size;
    }
    
}