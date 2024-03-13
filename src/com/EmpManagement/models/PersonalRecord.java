package com.EmpManagement.models;

public class PersonalRecord{
    private int empId;
    private String name;
    private int salary;
    public PersonalRecord(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getEmpId() {
        return empId;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "empId=" + empId +
                ", name=" + name  +
                ", salary=" + salary;
    }
}
