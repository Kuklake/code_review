package xyz.kuklake.repository;

import xyz.kuklake.model.Employee;

public interface EmployeeRepository {
    Employee findById(long id);
}
