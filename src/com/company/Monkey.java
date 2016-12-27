package com.company;

/**
 * Created by Emil on 2016-12-27.
 */
@MyAnnotation(zwierze = "małpa")
class Monkey implements Animal{


    @Override
    public void eat() {
        System.out.println("małpa zjadł banana");
    }
}