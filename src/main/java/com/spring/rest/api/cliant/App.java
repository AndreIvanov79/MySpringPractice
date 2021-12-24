package com.spring.rest.api.cliant;

import com.spring.rest.api.cliant.configuration.MyConfig;
import com.spring.rest.api.cliant.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication=context.getBean("communication", Communication.class);
        List<Employee> allEmployees=communication.getAllEmployees();
        System.out.println(allEmployees);

    }
}
