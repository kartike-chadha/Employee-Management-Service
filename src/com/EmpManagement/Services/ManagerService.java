package com.EmpManagement.Services;

import com.EmpManagement.models.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class ManagerService {
    List<String> findReporteesGivenManager(String managerName,List<Employee> employeeList){
        return employeeList.stream()
                .filter(
                        employee->employee.getReportingTo()
                                .getPersonalRecord()
                                .getName()
                                .equals(managerName)
                ).map(
                        employee->employee.getPersonalRecord().getName()
                ).collect(Collectors.toList());
    }
}
