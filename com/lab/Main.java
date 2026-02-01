package com.lab;

import java.util.function.Predicate;

public class Main {
    public static void lambda_representation(){
        //one-line expressions
        MyNumber num = () -> 23.4F; // without args

        MyString str1 = a -> a.toUpperCase(); // One argument
        MyString str2 = (a) -> a.trim(); // One argument with braces
        MyString str3 = (String a) -> "Hello " + a; // One argument with braces and type
        MyString str4 =  String::toLowerCase; // Link to Method in class String

        MyDouble db1 = (a,b) -> a+b;// Two arguments can be only with braces
        MyDouble db2 = (double a,double b) -> a+b; // Two args can be typed or not but BOTH;
        MyDouble db3 = Double::sum;//Link to method sum
        // block expressions
        MyDouble db4 = (a,b) ->{
            a = a * b;
            b = b * a;
            return a + b;
        };
        MyDouble db5 = (double a, double b)->{
            a = a * a;
            b = b * b;
            return a + b;
        };
        MyNumber num2 = ()->{
            return 55.5F;
        };

    }
    public static void test_predicate(int[] arr, Predicate<Integer> predicate){
        int counter = 0;
        for (int x: arr) {
            if(predicate.test(x))counter++;
        }
        System.out.println(counter);
    }
    public static void main(String... args){

        Predicate<Integer> predicate = (Integer x) -> x % 2 == 0;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        test_predicate(arr,predicate);
    }
}
