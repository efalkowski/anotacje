package com.company;


public class Cat implements Animal{
    @MyAnnotation(anAnimal = "kot")
    @Override
    public void eat(){
        System.out.println("kot zjadł mysz");
    }
}