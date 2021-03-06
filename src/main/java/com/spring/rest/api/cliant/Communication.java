package com.spring.rest.api.cliant;

import com.spring.rest.api.cliant.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL="http://localhost:8888/MySpringMVC/api/employees";

    public List<Employee> getAllEmployees(){
        ResponseEntity<List<Employee>> responseEntity=restTemplate.exchange(URL, HttpMethod.GET, null
                , new ParameterizedTypeReference<List<Employee>>() {});
        List<Employee> allEmployees=responseEntity.getBody();
        return allEmployees;
    }

    public Employee getEmployee(int id){
        return null;
    }

    public void saveEmployee(Employee employee){

    }

    public void deleteEmployee(int id){

    }
}
