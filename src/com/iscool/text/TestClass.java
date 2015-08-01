package com.iscool.text;

public class TestClass{
    public static void notMain(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        MyCons myObject =  new MyCons();
        myObject.setName("Saleem");
        myObject.setAge(52);
        myObject.setFatherName("DDDDDDD");

        String name = myObject.getName();
        System.out.println(name);
        //notMain();         J2EE
    }
}
