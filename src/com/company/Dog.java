package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
@MyAnnotation(zwierze = "pies")
class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("pies zjadł królika");

    }
}