package com.EmpManagement.models;

public class Employee {
    protected PersonalRecord personalRecord;
    protected Department department;
    protected String designation;

    protected Manager reportingTo;

    public Employee(PersonalRecord personalRecord,Department department, String designation){
        this.personalRecord = personalRecord;
        this.department = department;
        this.designation = designation;
    }
    public Employee(PersonalRecord personalRecord,Department department, String designation, Manager reportingTo){
        this.personalRecord = personalRecord;
        this.department = department;
        this.designation = designation;
        this.reportingTo = reportingTo;
    }

    public PersonalRecord getPersonalRecord() {
        return personalRecord;
    }

    public String getDesignation() {
        return designation;
    }

    public Manager getReportingTo() {
        return reportingTo;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return  personalRecord +" "+ department +
                ", designation=" + designation  +
                ", reportingTo=" + reportingTo.getPersonalRecord().getName();
    }
}