package xyz.kuklake.repository;

import xyz.kuklake.model.Timesheet;

import java.util.ArrayList;
import java.util.List;

public class TimesheetDBRepository implements TimesheetRepository {

    private static List<Timesheet> timesheets = new ArrayList<>();

    @Override
    public void save(Timesheet timesheet) {
        TimesheetDBRepository.timesheets.add(timesheet);
    }

    @Override
    public List<Timesheet> findAll() {
        return timesheets;
    }
}
