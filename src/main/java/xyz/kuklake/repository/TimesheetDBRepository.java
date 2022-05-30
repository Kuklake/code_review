package xyz.kuklake.repository;

import xyz.kuklake.model.Timesheet;

import java.util.ArrayList;
import java.util.List;

public class TimesheetDBRepository implements TimesheetRepository {

    public static List<Timesheet> timesheets = new ArrayList<>();

    public void save(Timesheet timesheet) {
        TimesheetDBRepository.timesheets.add(timesheet);
    }
}
