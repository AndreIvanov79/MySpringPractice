package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 3,message = "*min 3 symbols")
    private String name;

    @NotBlank(message = "*is required field")
    private String surname;

    @Min(value = 500, message = "*low limit is 500")
    @Max(value = 1500, message = "*high limit is 1500")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String system;
    private Map<String,String> systems;
    private String[] languages;
    private Map<String,String> langList;

    @CheckEmail(value = "emp.com", message = "*must be ...emp.com")
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "*incorrect pattern")
    private String phoneNumber;

    public Employee() {
        departments=new HashMap<>();
        departments.put("Information Technologies", "IT");
        departments.put("Quality Assurance", "QA");
        departments.put("Human Resources", "HR");

        systems=new HashMap<>();
        systems.put("Windows","Windows");
        systems.put("Linux","Linux");
        systems.put("MacOS","MacOS");

        langList=new HashMap<>();
        langList.put("English","EN");
        langList.put("French","FR");
        langList.put("Deutch","DE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Map<String, String> getSystems() {
        return systems;
    }

    public void setSystems(Map<String, String> systems) {
        this.systems = systems;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
