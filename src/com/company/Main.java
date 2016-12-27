package com.company;


import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Class malpa = Class.forName("com.company.Monkey");

        Class kot = Class.forName("com.company.Cat");

        Class pies = Class.forName("com.company.Dog");

        Method refleks = null;
        try {
            refleks = malpa.getMethod("eat", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            refleks.invoke(malpa.newInstance(), null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}





