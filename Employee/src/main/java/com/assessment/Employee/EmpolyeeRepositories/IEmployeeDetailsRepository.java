package com.assessment.Employee.EmpolyeeRepositories;

import com.assessment.Employee.EmpolyeeEntities.EmployeeDetailsEntity;

import java.util.List;

public interface IEmployeeDetailsRepository {


    EmployeeDetailsEntity getEmployeeById(Long id);

    List<EmployeeDetailsEntity> getAllEmployees();

    Boolean saveOrupdateEmployeeDetails(EmployeeDetailsEntity employeeDetailsEntity);

    Boolean deleteEmployeeById(Long id);
}
