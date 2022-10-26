package com.example.stream_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;


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


    }

}
