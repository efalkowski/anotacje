package com.company;


import org.reflections.Reflections;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Reflections reflections = new Reflections();

        Set<Class<? extends Animal>> subTypes = reflections.getSubTypesOf(Animal.class);

        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(MyAnnotation.class);

        }



    }






