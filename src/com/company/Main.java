package com.company;


import org.reflections.Reflections;


import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        if(args.length == 0){
            System.out.println("Pierw podaj jeden z argumentów: pies, kot, małpa ");
            System.exit(1);}
        Reflections reflections = new Reflections("com");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(MyAnnotation.class);



        for (Class cl : annotated) {
            MyAnnotation annot = (MyAnnotation) cl.getAnnotation(MyAnnotation.class);

            try {
                Object instance = cl.newInstance();
                if (instance instanceof Animal && annot.ananimal().equals(args[0])){

                Animal animal = (Animal) instance;
                animal.eat();}
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }


        }

    }


}






