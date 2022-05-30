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

    private EmployeeRepository employeeRepository;
    private TimesheetRepository timesheetRepository;

    public TimesheetService(EmployeeRepository employeeRepository, TimesheetRepository timesheetRepository) {
        this.employeeRepository = employeeRepository;
        this.timesheetRepository = timesheetRepository;
    }

    public void reportHours(long employeeId, int hours, Month month) {

        Employee employee = employeeRepository.findById(employeeId);

        Timesheet timesheet = new Timesheet();
        timesheet.setEmployee(employee);
        timesheet.setMonth(month);
        timesheet.setNumberOfHours(hours);
        timesheet.setMoodType(calculateMood(hours));

        timesheetRepository.save(timesheet);
    }

    private Mood calculateMood(int hours) {

        Mood mood;

        if (hours < 40) {
            mood = Mood.HAPPY;
        } else if (hours == 40) {
            mood = Mood.NORMAL;
        } else {
            mood = Mood.SAD;
        }

        return mood;
    }
}