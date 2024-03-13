package com.EmpManagement.models;

public class Department implements MemberAddable{
    private int deptId;
    private String deptName;
    private Manager manager;



    public Department(int deptId,String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public Department(int deptId, String deptName,Manager manager){

        this.deptId = deptId;
        this.deptName = deptName;
        this.manager = manager;
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return
                "deptId=" + deptId +
                ", deptName=" + deptName;
    }
}