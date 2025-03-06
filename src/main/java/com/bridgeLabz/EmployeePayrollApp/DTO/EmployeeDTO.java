package com.bridgeLabz.EmployeePayrollApp.DTO;


public class EmployeeDTO {
//<======================================UC3==================================>
    String name;
    Long salary;

    Long id;

    public EmployeeDTO(String name, Long salary) {
        this.name = name;
        this.salary = salary;

        this.id = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Long getId() {
        return id;
    }
}