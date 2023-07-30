package java8.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Set;

/**
 * ZonedDateTime class is for manipulating with Time Zone
 */
public class ZonedDateTime {
    public static void main(String[] args) {

        // Show zoneIds
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId: zoneIds) {
            ZoneId zoneId1 = ZoneId.of(zoneId);
            String displayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println(zoneId + ": " + displayName);
        }

        // Get zone id by string literal
        ZoneId karachi = ZoneId.of("Asia/Karachi");
        LocalDateTime karachiDateTime = LocalDateTime.now(karachi);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Karachi: " + karachiDateTime);
        System.out.println("Berlin: " + localDateTime);

        // Take difference
        Duration duration = Duration.between(karachiDateTime, localDateTime);
        System.out.println(duration);
    }
}
