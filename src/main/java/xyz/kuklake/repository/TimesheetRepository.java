package xyz.kuklake.repository;

import xyz.kuklake.model.Timesheet;

import java.util.List;

public interface TimesheetRepository {
    void save(Timesheet timesheet);
    List<Timesheet> findAll();
}