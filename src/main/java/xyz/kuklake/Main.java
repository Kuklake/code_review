package xyz.kuklake;

import xyz.kuklake.model.Timesheet;
import xyz.kuklake.repository.TimesheetRepository;
import xyz.kuklake.services.TimesheetService;

import java.time.Month;
import java.util.List;

public class Main {
    //test GITA 

    public static void main(String[] args) {
        TimesheetService timesheetService = new TimesheetService();

        timesheetService.reportHours(4, 40, Month.MAY);

        List<Timesheet> timesheets = TimesheetRepository.timesheets;

        System.out.println(timesheets);
    }
}
