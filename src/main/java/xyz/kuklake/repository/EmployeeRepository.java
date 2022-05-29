package xyz.kuklake.repository;

import xyz.kuklake.employee.Employee;

public class EmployeeRepository {

    public Employee find(long id) {
        Employee employee = new Employee("Kuklake", "Bulake");
        employee.setFirstName("Kuklake" + id);
        employee.setLastName("Bulake" + id);

        return employee;
    }
}
