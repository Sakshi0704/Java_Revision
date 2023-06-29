package com.life.codingDSA;

class circular_queue{
	  // implement the class as mentioned in the problem statement above
	  
	  int size;  //5
	  int arr[];
	  int front=0;  //0<5
	  int rear=0;  //0<5
	  
	  
	  public circular_queue(int size){
	      this.size = size;
	      this.arr = new int[size];
	  }
	  
	  
	  boolean enqueue(int data){ 
	      if(rear<size){   //0<5 --> 1<5 --> 2<5 --> 3<5 --> 4<5 --> 5<5
	          arr[rear] = data; //x//y//z//a //b
	          rear++;  //1//2//3//4//5
	          return true;
	      }
	      return false;
	  }
	  
	  boolean dequeue(){
	      if(front<size){
	          System.out.println(arr[front]);
	          front++;
	          return true;
	      }else{
	          return false;
	      }
	  }
	  
	  int size(){
	      return rear - front;
	  }
	  
	}
