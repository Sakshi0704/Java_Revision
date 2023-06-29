package com.life.codingConcepts;
import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int marks;
    
    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public int compareTo(Student student){
        if(student.marks == this.marks){
            return this.name.compareTo(student.name);
        }
        return student.marks-this.marks;
    }
    
}

class Make_Leaderboard {

    public static void main(String args[] ) throws Exception {
        //BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        Set<Student> set = new TreeSet<>();
        while(n-->0){
            Student student = new Student(sr.next(),sr.nextInt());
            set.add(student);
        }
        
        int count =0;
        int preMarks = 0;
        int rank = 1;
        for(Student s : set){
            if(s.marks != preMarks){
                rank = count+1;
                preMarks = s.marks;
            }
            System.out.println(rank+" "+s.name);
            count++;
        }
        
    }
}