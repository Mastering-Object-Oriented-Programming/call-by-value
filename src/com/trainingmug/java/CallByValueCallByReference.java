package com.trainingmug.java;

public class CallByValueCallByReference {

    //call by value

    int add(int x, int y){
        System.out.println("Inside add method : x = " + x + " y = " + y);
        return x + y;
    }

    public static void main(String[] args) {
        CallByValueCallByReference cbcr = new CallByValueCallByReference();
        int x = 100;
        int y = 200;
        System.out.println("Before Calling ; x = " + x + " y = " + y);
        System.out.println(cbcr.add(x, y));
        System.out.println("After Calling: x = " + x + " y = " + y);
    }
}
