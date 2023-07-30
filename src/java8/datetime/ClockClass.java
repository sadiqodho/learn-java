package java8.datetime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

/**
 * ClockClass is a usage example of Java 8 Clock class
 */
public class ClockClass {

    public static void main(String[] args) {

        // Get Current date and time as system default time zone
        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        System.out.println(instant);

        // Get current date and time with system Universal Time Coordinated
        Clock clock1 = Clock.systemUTC();
        Clock clock2 = Clock.offset(clock1, Duration.ofHours(3));
        System.out.println(clock1.instant());
        System.out.println(clock2.instant());

    }
}
