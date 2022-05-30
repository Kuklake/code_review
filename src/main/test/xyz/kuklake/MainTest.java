package xyz.kuklake;

import org.junit.jupiter.api.Test;
import xyz.kuklake.model.Mood;
import xyz.kuklake.model.Timesheet;
import xyz.kuklake.repository.TimesheetRepository;
import xyz.kuklake.services.TimesheetService;

import java.time.Month;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    public void expectedMoodTypeNormal() {

        // given
        TimesheetService timesheetService = new TimesheetService();
        long employeeId = 4;
        int hours = 40;
        Month month = Month.MAY;
        String firstName = "Kuklake" + employeeId;
        String lastName = "Bulake" + employeeId;
        Mood type = Mood.NORMAL;
        //when
        timesheetService.reportHours(employeeId, hours, month);
        List<Timesheet> actual = TimesheetRepository.timesheets;
        int expected = 1;
        // then
        assertThat(actual.size()).isEqualTo(expected);
        Timesheet actualTimesheet = actual.get(0);
        assertThat(actualTimesheet.getMonth()).isEqualTo(month);
        assertThat(actualTimesheet.getEmployee().getId()).isEqualTo(employeeId);
        assertThat(actualTimesheet.getNumberOfHours()).isEqualTo(hours);
        assertThat(actualTimesheet.getEmployee().getFirstName()).isEqualTo(firstName);
        assertThat(actualTimesheet.getEmployee().getLast_name()).isEqualTo(lastName);
        assertThat(actualTimesheet.getMood_type()).isEqualTo(type);
    }
    @Test
    public void expectedMoodTypeHappy(){
        // given
        long employeeId = 4;
        int hours = 38;
        Month month = Month.MAY;
        TimesheetService timesheetService = new TimesheetService();
        Mood type = Mood.HAPPY;
        // when
        timesheetService.reportHours(employeeId, hours, month);
        List<Timesheet> actual = TimesheetRepository.timesheets;
        // then
        assertThat(actual.get(0).getMood_type()).isEqualTo(type);
    }
    @Test
    public void expectedMoodTypeSad(){
        // given
        long employeeId = 4;
        int hours = 46;
        Month month = Month.MAY;
        TimesheetService timesheetService = new TimesheetService();
        Mood type = Mood.SAD;
        // when
        timesheetService.reportHours(employeeId, hours, month);
        List<Timesheet> actual = TimesheetRepository.timesheets;
        // then
        assertThat(actual.get(0).getMood_type()).isEqualTo(type);
    }
}