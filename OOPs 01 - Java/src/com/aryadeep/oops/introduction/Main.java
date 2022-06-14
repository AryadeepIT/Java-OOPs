package com.aryadeep.oops.introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] rno = new int[5];

        // store 5 names
        String[] names = new String[5];

        // store 5 students(rno, marks, name)
        int[] rnos = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student aryadeep;
//        aryadeep = new Student();
        Student aryadeep = new Student();

//        aryadeep.rnos = 15;
//        aryadeep.name = "Aryadeep";
//        aryadeep.marks = 88.5f;

//        aryadeep.changeName("Sanchita");
//        aryadeep.greeting();

        System.out.println(aryadeep.rnos);
        System.out.println(aryadeep.name);
        System.out.println(aryadeep.marks);

        Student random = new Student(aryadeep);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Hagemaru";
        System.out.println(two.name);
    }
}

    // create a class
    // for every single student
    class Student {
        int rnos;
        String name;
        float marks = 90;

        // we need a way to add the values of the above properties object by object
        // we need on e word to access every object

        void greeting(){
            System.out.println("My name is "+ this.name);
        }

        void changeName(String newName){
            name = newName;
        }
        Student (){
            // this is how you call constructor from another constructor
            // internally it is something like --
            // new Student();
            this(13, "default", 13.5f);
        }
        Student (Student other){
            this.name = other.name;
            this.rnos = other.rnos;
            this.marks = other.marks;
        }
//        Student () {
//            this.rnos = 15;
//            this.name = "Aryadeep";
//            this.marks = 88.5f;
//        }
        // Student ram = new Student(17, "Ram", 89.7f);
        // here this will be replaced with ram
        Student (int roll, String name, float marks){
            this.rnos = roll;
            this.name = name;
            this.marks = marks;
        }
    }

