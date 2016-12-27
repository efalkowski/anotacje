package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
@MyAnnotation(ananimal = "małpa")
public class Monkey implements Animal{


    @Override
    public void eat() {
        System.out.println("małpa zjadła banana");
    }
}