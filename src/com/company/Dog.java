package com.company;


public class Dog implements Animal{
    @MyAnnotation(anAnimal = "pies")
    @Override
    public void eat(){
        System.out.println("pies zjadł królika");
    }
}