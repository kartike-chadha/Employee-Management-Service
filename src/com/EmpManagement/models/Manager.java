package com.EmpManagement.models;

import java.util.List;

public class Manager extends Employee implements MemberAddable{
    public List<Employee> reportees;
    public Manager(PersonalRecord personalRecord,Department department, String designation){
        super(personalRecord,department, designation);
    }
    public Manager(PersonalRecord personalRecord,Department department, String designation, Manager reportingTo, List<Employee> reportees) {
        super(personalRecord, department,designation, reportingTo);
        this.reportees = reportees;
    }

    public List<Employee> getReportees() {
        return reportees;
    }
    public void addReportee(Employee employee){
        reportees.add(employee);

    }
}
