package com.company;


import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Reflections reflections = new Reflections("com.company.*");

    //    Set<Class<? extends Animal>> subTypes = reflections.getSubTypesOf(Animal.class);
        // this also results 0

        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(MyAnnotation.class);


        System.out.println(annotated.size());


        }



    }






