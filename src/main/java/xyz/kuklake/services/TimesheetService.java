package xyz.kuklake.services;

import xyz.kuklake.model.Employee;
import xyz.kuklake.model.Mood;
import xyz.kuklake.model.Timesheet;
import xyz.kuklake.repository.EmployeeDBRepository;
import xyz.kuklake.repository.EmployeeRepository;
import xyz.kuklake.repository.TimesheetDBRepository;
import xyz.kuklake.repository.TimesheetRepository;

import java.time.Month;

public class TimesheetService {


    public TimesheetService(EmployeeRepository employeeRepository, TimesheetRepository timesheetRepository) {

    }

    public void reportHours(long employeeId, int hours, Month month) {

        private EmployeeRepository employeeRepository;
        private TimesheetRepository timesheetRepository;

            public TimesheetService (EmployeeRepository employeeRepository, TimesheetRepository timesheetRepository) {
                this.employeeRepository = employeeRepository;
                this.timesheetRepository = timesheetRepository;
            }
        }
//        EmployeeDBRepository employeeRepository = new EmployeeDBRepository();
        Employee employee = employeeRepository.findByID(employeeId);

        Timesheet timesheet = new Timesheet();
        timesheet.setEmployee(employee);
        timesheet.setMonth(month);
        timesheet.setNumberOfHours(hours);

        if (hours < 40) {
            timesheet.setMoodType(Mood.HAPPY);
        } else if (hours == 40) {
            timesheet.setMoodType(Mood.NORMAL);
        } else
            timesheet.setMoodType(Mood.SAD);

       // TimesheetDBRepository timesheetRepository= new TimesheetDBRepository(); // tak było
        //teraz działamy na zależnościach wstrzykiwanych przez konstruktpr

        timesheetRepository.save(timesheet);
    }

}
