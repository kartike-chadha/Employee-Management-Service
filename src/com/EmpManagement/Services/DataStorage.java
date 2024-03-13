package com.EmpManagement.Services;

import com.EmpManagement.models.*;

import java.util.*;

public class DataStorage {
    public HashMap<String, List<?>> dataStore;

    public DataStorage(){
    }

    public static Company populate(){
        Company company  = new Company("xyz");
        Department dept1 = new Department(001,"Development");
        Department dept2 = new Department(002,"HR");
        Department dept3 = new Department(003,"Accounts");
        company.setDepartments(Arrays.asList(dept1,dept2,dept3));
        Employee emp1 = new Manager(new PersonalRecord(101,"Aarav",500000),null,"CEO",null,new ArrayList<Employee>());


        Employee emp2 = new Manager(new PersonalRecord(102,"Arun",350000),dept1,"Manager",((Manager)emp1),new ArrayList<>());
        Employee emp3 = new Manager(new PersonalRecord(103,"Bharat",330000),dept2,"Manager",((Manager)emp1),new ArrayList<>());
        Employee emp4 = new Manager(new PersonalRecord(104,"Charan",340000),dept3,"Manager",((Manager)emp1),new ArrayList<>());
        dept1.setManager(((Manager)emp2));
        dept2.setManager(((Manager)emp3));
        dept3.setManager(((Manager)emp4));

        Collections.addAll(((Manager)emp1).reportees,emp2,emp3,emp4);

        Employee emp5 = new Employee(new PersonalRecord(105,"Divan",123000),dept1,"Developer",((Manager)emp2));
        Employee emp6 = new Employee(new PersonalRecord(106,"Deepesh",140000),dept1,"Developer",((Manager)emp2));
        Employee emp7 = new Employee(new PersonalRecord(107,"Eesha",150000),dept1,"Senior Developer",((Manager)emp2));
        Collections.addAll(((Manager)emp2).reportees,emp5,emp6,emp7);
        Employee emp8 = new Employee(new PersonalRecord(108,"Eshwar",110000),dept2,"HR",((Manager)emp3));
        Employee emp9 = new Employee(new PersonalRecord(109,"Falguni",120000),dept2,"HRBP",((Manager)emp3));
        Employee emp10 = new Employee(new PersonalRecord(110,"Girish",90000),dept2,"HR",((Manager)emp3));
        Collections.addAll(((Manager)emp3).reportees,emp8,emp9,emp10);
        Employee emp11 = new Employee(new PersonalRecord(111,"Gaurav",100000),dept3,"CA",((Manager)emp4));
        Employee emp12 = new Employee(new PersonalRecord(112,"Harish",80000),dept3,"Consultant",((Manager)emp4));
        Employee emp13 = new Employee(new PersonalRecord(113,"Eesha",90000),dept3,"CA",((Manager)emp4));
        Collections.addAll(((Manager)emp4).reportees,emp11,emp12,emp13);
        List<Employee> employeeList = Arrays.asList(emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10,emp11,emp12,emp13);

        company.setEmployeeList(employeeList);
        return company;
    }
//    public static <T> void addMember(HashMap<String, List<?>> dataStore, String key, T element) {
//        List<?> list = dataStore.get(key);
//
//        if (list == null) {
//            list = new ArrayList<>();
//            dataStore.put(key, list);
//        }
//        list.add(element);
//    }

}
