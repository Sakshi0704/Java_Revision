package com.life.codingConcepts;

public class Compare_Numbers {
	public static void main(String args[]) {
		System.out.println("created numberclass");
	}
}



interface comparison{
  public int comparemax(int a,int b);
  public int comparemax(int a,int b,int c);
  public int comparemax(int a,int b,int c,int d);
  public int comparemax(int a);
  public int comparemin(int a);
  public int comparemin(int a,int b);
  public int comparemin(int a,int b,int c);
  public int comparemin(int a,int b,int c,int d);
    
  
}



class numberclass implements comparison{
   // complete the class which implements the comparison class
   public int comparemax(int a,int b){
       if(a<b){
           return b;
       }else{
           return a;
       }
   }
   
    public int comparemax(int a,int b,int c){
        int n = comparemax(a,b);
        if(n<c){
            return c;
        }else{
            return n;
        }
        
    }
    
     public int comparemax(int a,int b,int c,int d){
        int n = comparemax(a,b,c);
        if(n<d){
            return d;
        }else{
            return n;
        }
        
    }
    
     public int comparemax(int a){
        return a;
    }
    
    public int comparemin(int a){
        return a;
    }
    
     public int comparemin(int a,int b){
           if(a<b){
           return a;
                 }else{
                 return b;
            }
     }
     
      public int comparemin(int a,int b,int c){
        int n = comparemin(a,b);
        if(n<c){
            return n;
        }else{
            return c;
        }
        
    }
    
      public int comparemin(int a,int b,int c,int d){
        int n = comparemin(a,b,c);
        if(n<d){
            return n;
        }else{
            return d;
        }
        
    }
}
