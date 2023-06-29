package com.life.codingDSA;

public class Create_your_own_stack {
	public void main(String args[]) {
		System.out.println("Created the stack class");
	}
}


class stack{
  // complete the class as mentioned in the problem statement
  int top=-1;
  int size;
  int arr[];
  
  stack(int size){
      this.size = size;
      this.arr = new int[size];
  }
  
  boolean push(int data){
      if(top<size){
          top++;
          arr[top] = data;
          return true;
      }
      return false;
  }
  
  boolean pop(){
      if(top>=0&&top<size){
          System.out.println(arr[top]);
          top--;
          return true;
      }
      return false;
  }
  
  boolean peek(){
      if(top>=0&&top<size){
          System.out.println(arr[top]);
          return true;
      }
      return false;
  }
  
  int size(){
      return top+1;
  }
  
}