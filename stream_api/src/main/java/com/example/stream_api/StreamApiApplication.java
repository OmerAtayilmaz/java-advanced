package com.example.stream_api;

import com.example.stream_api.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamApiApplication {

    public static void main(String[] args) {
        java.util.List<String> employeeList=new ArrayList<>();
        employeeList.add("Andrew");
        employeeList.add("Jonas");
        employeeList.add("Jony");
        employeeList.add("");
        employeeList.add("Jhon");
        employeeList.add("Huracan");
        //stream.filter()... diye devam eder.
        long count=employeeList.stream().filter(item->!item.equals("")).count();
        System.out.println("Employee Count:"+count);

        //Usage of list
        List<Product> pList=java.util.List.of(
                new Product(2L,"TV",true),
                new Product(1L,"Computer",false),
                new Product(5L,"Macbook Pro",true),
                new Product(17L,"Apple Watch",false)
        );

        //sout with stream api
        employeeList.forEach(System.out::println);


        //collect kullanımı
        java.util.Set<String> s=employeeList.stream().filter(item->!item.isEmpty())
                .collect(Collectors.toSet());

        java.util.List<String> s1=employeeList.stream().filter(item->!item.isEmpty())
                .collect(Collectors.toList());

        //sorting
        System.out.println("SSSSSORTINGGGGG");
        java.util.List<String> sortedList= employeeList.stream()
                .sorted(java.util.Comparator.comparing(String::isEmpty))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        //all-matching
        boolean isItTrue=employeeList
                .stream()
                .allMatch(item->item.length()>2);
        System.out.println(isItTrue);

        //any-matching
        boolean isAny=employeeList
                .stream()
                .anyMatch(item->item.length()>4);
        System.out.println(isAny);

        //none-matching
        boolean isNone=employeeList
                .stream()
                .noneMatch(p->p.equals("Jhon"));
        System.out.println(isNone);


        //max
        pList.stream()
                .max(java.util.Comparator.comparing(Product::getId)).ifPresent(item->{
                    System.out.println(item.getName());
                });

        //grouping
        java.util.Map<Boolean,List<Product>> groupByGender= pList.stream()
                .collect(Collectors.groupingBy(Product::getStatus));
        groupByGender.forEach((status,people)->{
            System.out.println(status);
            people.forEach(System.out::println);
        });

        //test

    }

}
