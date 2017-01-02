package com.company;

import sun.rmi.runtime.Log;

import java.io.File;
import java.net.URL;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
                                                  InstantiationException, NoSuchMethodException {

        if (args.length == 0) {
           System.out.println("Pierw podaj jeden z argumentów: pies, kot, małpa ");
           System.exit(1);
        }

        Set<Class> myList = getClassesInPackage("com.company");

        for (Class cl : myList) {

            if(!cl.isInterface()) {
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
    
    private static Set<Class> getClassesInPackage(String packageName) {
        Set<Class> classes = new HashSet<>();
        String packageNameSlashed = packageName.replace(".", "/");
        // Get a File object for the package
        URL directoryURL = Thread.currentThread().getContextClassLoader().getResource(packageNameSlashed);

        if (directoryURL == null) {
            System.out.println("Could not retrieve URL resource: " + packageNameSlashed);
            return classes;
        }

        String directoryString = directoryURL.getFile();

        if (directoryString == null) {
            System.out.println("Could not find directory for URL resource: " + packageNameSlashed);
            return classes;
        }

        File directory = new File(directoryString);

        if (directory.exists()) {
            // Get the list of the files contained in the package
            String[] files = directory.list();

            for (String fileName : files){
                // We are only interested in .class files
                if (fileName.endsWith(".class")) {
                    // Remove the .class extension
                    fileName = fileName.substring(0, fileName.length() - 6);
                    try {
                        classes.add(Class.forName(packageName + "." + fileName));
                    } catch (ClassNotFoundException e) {
                        System.out.println(packageName + "." + fileName + " does not appear to be a valid class." + e);
                    }
                }
            }
        } else {
            System.out.println(packageName + " does not appear to exist as a valid package on the file system.");
        }
        return classes;
    }
}