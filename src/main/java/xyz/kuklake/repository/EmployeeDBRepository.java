package xyz.kuklake.repository;

import xyz.kuklake.model.Employee;

public class EmployeeDBRepository implements EmployeeRepository {

    public static Employee findByID(long id) {  //nie lepiej addEmployee?
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Kuklake"); //po co tutaj ID?
        employee.setLastName("Bulake"); //po co tutaj ID?

        return employee;
    }
}
