package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
                                                  InstantiationException, NoSuchMethodException {

        if (args.length == 0) {
           System.out.println("Pierw podaj jeden z argumentów: pies, kot, małpa ");
           System.exit(1);
        }

        List<Class> myList = Arrays.asList(Dog.class, Cat.class, Monkey.class);

        for (Class cl : myList) {
            Object instance = cl.newInstance();

            if (instance instanceof Animal) {
                MyAnnotation myAnnotation = cl.getMethod("eat").getAnnotation(MyAnnotation.class);

                if (myAnnotation.anAnimal().equals(args[0])) {
                   ((Animal) instance).eat();
                   break;
                }

            }

        }
    }
}