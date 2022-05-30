package xyz.kuklake.repository;

import xyz.kuklake.model.Timesheet;

import java.util.ArrayList;
import java.util.List;

public class TimesheetRepository {

    public static List<Timesheet> timesheets = new ArrayList<>();

    public void save(Timesheet timesheet) {
        timesheets.add(timesheet);
    }
}
