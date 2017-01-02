package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
public class Monkey implements Animal{

    @MyAnnotation(ananimal = "małpa")
    @Override
    public void eat() {
        System.out.println("małpa zjadła banana");
    }
}