package java8.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * PeriodClass is finding the periods between two dates
 */
public class PeriodClass {
    public static void main(String[] args) {

        Period period1 = Period.of(1, 1, 1);
        System.out.println(period1);

        Period period2 = Period.ofWeeks(2);
        System.out.println(period2);

        LocalDate localDate1 = LocalDate.of(2023, 06, 24);
        LocalDate localDate2 = LocalDate.now();

        System.out.println(Period.between(localDate1, localDate2));
        System.out.println(ChronoUnit.DAYS.between(localDate1, localDate2));

    }
}
