package com.udemy.basic;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelismExample {

    // transform to uppercase.
    public static void main(String[] args) {
        List<String> namesList = List.of("Bob","Jill","Amy","Neha");
        System.out.println("namesList : "+namesList);

        List<String> namesUpperCase = namesList
                                        .parallelStream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println("upped "+namesUpperCase);
    }
}
