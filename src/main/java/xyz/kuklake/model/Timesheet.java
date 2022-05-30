package xyz.kuklake.model;

import lombok.Setter;
import lombok.ToString;

import java.time.Month;

@ToString
@Setter
public class Timesheet {
    Employee employee;
    Month month;
    int NumberOfHours;
    Mood moodType;

}
