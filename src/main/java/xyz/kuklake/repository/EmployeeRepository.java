package xyz.kuklake.repository;

import xyz.kuklake.model.Employee;

public interface EmployeeRepository {
    public Employee findById(long id);
}
