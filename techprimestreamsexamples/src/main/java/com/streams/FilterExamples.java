package com.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExamples {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sam", "Zim", "Nim");

        for (String name : names){
            if(!name.equals("Zim")){
                System.out.println(name);
            }
        }


    }
}
