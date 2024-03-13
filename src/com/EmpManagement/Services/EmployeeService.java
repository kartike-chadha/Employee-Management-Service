package com.EmpManagement.Services;

import com.EmpManagement.models.Department;
import com.EmpManagement.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    Employee getEmployeeWithHighestSalary(List<Employee> employeesList){
        return employeesList.stream().max(Comparator.comparingInt(employee->employee.getPersonalRecord().getSalary())).orElse(null);
    }

    Employee getEmployeeWithHighestSalaryFromGivenList(List<String> employeeNameList,List<Employee> employeeList){
        return employeeList.stream().filter(employee->employeeNameList.contains(employee.getPersonalRecord().getName())).max(Comparator.comparingInt(employee->employee.getPersonalRecord().getSalary())).orElse(null);
    }


    Map<String,List<Integer>> groupEmployeesByDepartment(List<Employee> employeeList){
        return employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                employee->employee.getDepartment().getDeptName(),
                                Collectors.mapping(
                                        employee->employee.getPersonalRecord().getEmpId(),
                                        Collectors.toList()
                                )
                        )
                );
    }
    Map<String,List<Integer>> findEmployeesWithSameName(List<Employee> employeeList){
        return employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getPersonalRecord().getName(),Collectors.mapping(
                        employee->employee.getPersonalRecord().getEmpId(),
                        Collectors.toList()
                )))
                .entrySet().stream()
                .filter(entry->entry.getValue().size()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }

}
