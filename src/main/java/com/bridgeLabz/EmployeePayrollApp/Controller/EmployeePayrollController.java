package com.bridgeLabz.EmployeePayrollApp.Controller;

import com.bridgeLabz.EmployeePayrollApp.DTO.EmployeeDTO;
import com.bridgeLabz.EmployeePayrollApp.Services.EmployeePayrollServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
//    <==============================UC2===================================>

    EmployeePayrollServices employeeService;


    public EmployeePayrollController(EmployeePayrollServices employeeService) {
        this.employeeService = employeeService;
    }

    //UC1 --> CRUD operations on employee database through REST API's
    @GetMapping("/get/{id}")
    public EmployeeDTO get(@PathVariable Long id){
        return employeeService.get(id);
    }

    @PostMapping("/create")
    public EmployeeDTO create(@RequestBody EmployeeDTO newEmp){
        return employeeService.create(newEmp);
    }

    @PutMapping("/edit/{id}")
    public EmployeeDTO edit(@RequestBody EmployeeDTO emp, @PathVariable Long id){
        return employeeService.edit(emp, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return employeeService.delete(id);
    }

}