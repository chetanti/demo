package com.chet;

class Student {
    int age;
    Student(int age) {
           this.age = age;
    }
}
public class CPTest{
    public static void main(String[] args) {
    	Student s1 = new Student(3);
    	Student[] sa = go(s1, new Student(5));
           sa[0] = s1;
           for(Student s : sa){
                  System.out.print(s.age + " ");
           }
    }
    static Student[] go(Student s1, Student s2) {
           s1.age = 2;
           System.out.println("age " + s1.age + s2.age);
           Student[] sa = {s2, s1};
           return sa;
    }
}
