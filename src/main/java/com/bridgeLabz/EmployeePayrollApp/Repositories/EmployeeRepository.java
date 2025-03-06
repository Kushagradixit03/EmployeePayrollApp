package com.bridgeLabz.EmployeePayrollApp.Repositories;


import com.bridgeLabz.EmployeePayrollApp.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {


}