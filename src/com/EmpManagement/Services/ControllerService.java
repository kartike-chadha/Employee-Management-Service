package com.EmpManagement.Services;

import com.EmpManagement.models.Company;
import com.EmpManagement.models.Department;
import com.EmpManagement.models.Employee;

import java.sql.SQLOutput;
import java.util.*;

public class ControllerService {

    public static void controller(){
        Company company = DataStorage.populate();
        EmployeeService employeeService = new EmployeeService();
        ManagerService managerService = new ManagerService();

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("\n1: Get the employee with the highest salary\n" +
                    "2. Get the group of employees by departments\n" +
                    "3. Get the employees with the same name\n" +
                    "4. Get the employees given a manager name\n" +
                    "5.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("1. Enter a list of employees\n" +
                            "2. Get highest salary in the entire company");
                    int empWithHighestSalaryChoice = sc.nextInt();
                    sc.nextLine();
                    switch(empWithHighestSalaryChoice){

                        case 1:
                            List<String> givenEmployees = new ArrayList<>();
                            while (true) {
                                String empName = sc.nextLine().trim();

                                if (empName.isEmpty()) {
                                    break;
                                }

                                givenEmployees.add(empName);
                            }
                            Employee employeeWithHighestSalaryFromGivenList = employeeService.getEmployeeWithHighestSalaryFromGivenList(givenEmployees,company.getEmployeeList());
                            System.out.println(employeeWithHighestSalaryFromGivenList.toString());
                            break;
                        case 2:
                            Employee employeeWithHighestSalary = employeeService.getEmployeeWithHighestSalary(company.getEmployeeList());
                            System.out.println(employeeWithHighestSalary.toString());
                            break;
                        default:
                            System.out.println("Invalid");

                    }

                    break;
                case 2:
                    Map<String, List<Integer>> groupOfEmployeeByDepartment = employeeService.groupEmployeesByDepartment(company.getEmployeeList());
                    System.out.println(groupOfEmployeeByDepartment);
                    break;
                case 3:
                    Map<String,List<Integer>>  employeesWithTheSameName = employeeService.findEmployeesWithSameName(company.getEmployeeList());
                    System.out.println(employeesWithTheSameName);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Enter Manager name: ");
                    String managerName = sc.nextLine();
                    List<String> employeesWithGivenManager = managerService.findReporteesGivenManager(managerName,company.getEmployeeList());
                    System.out.println(employeesWithGivenManager);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }

        }
    }

}
