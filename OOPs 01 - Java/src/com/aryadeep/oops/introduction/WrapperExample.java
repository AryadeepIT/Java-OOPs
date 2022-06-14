package com.aryadeep.oops.introduction;

import java.beans.IntrospectionException;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a+ " "+ b);
        final A aryadeep = new A("Aryadeep");
        aryadeep.name = " Sanchita";

        // when a non primitive is final, you can not reassign it
//        aryadeep = new A("new object"); //not allowed

        A obj;
        for (int i = 0; i < 100; i++) {  // try with huge value
            obj = new A("Random Name");

        }

    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;


    }

}
class A {
    final int num = 10;
    String name;
    public A(String name){
        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

