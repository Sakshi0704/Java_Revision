package com.life.codingDSA;

import java.util.List;

public class Split_String_in_Two {

	 
	 List<String> list;
	 
	 Split_String_in_Two(List<String> list){
	     this.list = list;
	 }
	 
	 String separateString(){
	     //System.out.println(list.size());
	     StringBuilder sb = new StringBuilder();
	     for(int i=0;i<list.size();i++){
	         String str[] = list.get(i).split(",");
	         for(int j=0;j<str.length;j++){
	             String st = str[j].trim();
	             sb.append(st+"\n");
	         }
	     }
	     return sb.toString();
	 }
	
}
