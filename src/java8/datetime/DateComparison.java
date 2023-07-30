package java8.datetime;

import java.time.LocalDate;

/**
 * DateComparison is for comparing two dates
 */
public class DateComparison {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2023,07,23);
        System.out.println("compareTo: " + localDate1.compareTo(localDate2));
        System.out.println("isAfter: " + localDate1.isAfter(localDate2));
        System.out.println("isBefore: " + localDate1.isBefore(localDate2));
        System.out.println("isEqual: " + localDate1.isEqual(localDate2));
    }
}
