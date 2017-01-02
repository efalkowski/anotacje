package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
public class Dog implements Animal{

    @MyAnnotation(ananimal = "pies")
    @Override
    public void eat() {
        System.out.println("pies zjadł królika");

    }
}