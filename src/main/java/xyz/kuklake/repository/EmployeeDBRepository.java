package xyz.kuklake.repository;

import xyz.kuklake.model.Employee;

public class EmployeeDBRepository implements EmployeeRepository {

    public Employee findById(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Kuklake");
        employee.setLastName("Bulake");

        return employee;
    }
}