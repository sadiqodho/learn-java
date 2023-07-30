package java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * AlteringDatesAndTimes class
 */
public class AlteringDatesAndTimes {

    public static void main(String[] args) {
        // Local date alteration
        LocalDate localDate = LocalDate.of(2023, 01, 01);
        LocalDate oneMonthPlus = localDate.plusMonths(1);
        System.out.println(oneMonthPlus);

        // To specific month
        LocalDate fourMonthsWith = localDate.withMonth(4);
        System.out.println(fourMonthsWith);

        // with periods
        LocalDate periodsIncreased = localDate.plus(Period.ofWeeks(4));
        System.out.println(periodsIncreased);

        // with durations
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime duration = dateTime.minus(Duration.ofDays(1));
        System.out.println(duration);
    }
}
