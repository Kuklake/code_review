package xyz.kuklake.repository;

import xyz.kuklake.model.Employee;

import java.util.List;

public class EmployeeRepository {

    public static List<Employee> employeeList;

    public Employee find(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Kuklake" + id);
        employee.setLastName("Bulake" + id);
        employee.getFavoriteWords();

        save(employee);
        return employee;
    }
    public void save(Employee employee){
        employeeList.add(employee);
    }
}
