package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
public class Cat implements Animal{

    @MyAnnotation(ananimal = "kot")
    @Override
    public void eat() {
        System.out.println("kot zjadł mysz");

    }
}