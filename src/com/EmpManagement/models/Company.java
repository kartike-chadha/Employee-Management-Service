package com.EmpManagement.models;

import java.util.List;


public class Company implements MemberAddable{
    private String companyName;
    private List<Department> departments;
    private List<Employee> employeeList;

    public Company(String name){
        this.companyName = name;
    }

    public void setEmployeeList(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getName() {
        return companyName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return
                "companyName='" + companyName;
    }
}







