package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
@MyAnnotation(ananimal = "kot")
public class Cat implements Animal{


    @Override
    public void eat() {
        System.out.println("kot zjadł mysz");

    }
}