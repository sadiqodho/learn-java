package java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.YearMonth;

/**
 * LocalDateClass is a LocalDate class example in Java 8 which
 * contains multiple examples
 */
public class LocalDateClass {
    public static void main(String[] args) {

        // Get current date instance
        LocalDate ld1 = LocalDate.now();
        LocalTime lt1 = LocalTime.now();

        // Get specified date instance
        LocalDate ld2 = LocalDate.of(2023,12,15);
        LocalTime lt2 = LocalTime.of(1,22,25,54);

        // Get current month and day instance
        MonthDay monthDay = MonthDay.now();

        // Get current Year and Month instance
        YearMonth yearMonth = YearMonth.now();

        System.out.println(monthDay.getDayOfMonth());
    }
}