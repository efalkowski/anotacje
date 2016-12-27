package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
@MyAnnotation(ananimal = "pies")
public class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("pies zjadł królika");

    }
}