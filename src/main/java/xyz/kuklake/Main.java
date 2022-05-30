package xyz.kuklake;

import xyz.kuklake.model.Timesheet;
import xyz.kuklake.repository.EmployeeDBRepository;
import xyz.kuklake.repository.TimesheetDBRepository;
import xyz.kuklake.services.TimesheetService;

import java.time.Month;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TimesheetService timesheetService = new TimesheetService(new EmployeeDBRepository(),
                new TimesheetDBRepository());

        timesheetService.reportHours(4, 40, Month.MAY);

        List<Timesheet> timesheets = TimesheetDBRepository.timesheets;

        System.out.println(timesheets);
    }
}
