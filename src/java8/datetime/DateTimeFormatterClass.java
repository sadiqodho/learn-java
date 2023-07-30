package java8.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatterClass denotes different date format
 */
public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        String format = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDate);
        System.out.println(format);

        DateTimeFormatter farmatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(localDate.format(farmatter));
    }
}
