package java8.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * DurationClass is an example of Duration class of Java 8
 * It shows examples of durations between two dates
 */
public class DurationClass {
    public static void main(String[] args) {

        // First get instance of two dates for getting duration between them.
        LocalTime localTime = LocalTime.of(15, 3, 00);
        LocalTime localTime1 = LocalTime.now();

        System.out.println(Duration.between(localTime, localTime1));

        // It can be achieved by specified hours and amount
        Duration duration = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration);
    }
}
