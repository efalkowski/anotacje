package com.company;


public class Monkey implements Animal{
    @MyAnnotation(anAnimal = "małpa")
    @Override
    public void eat(){
        System.out.println("małpa zjadła banana");
    }
}