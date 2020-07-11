package test;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class LocalDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        time();
        dateFormate();
    }

    public static void time() {
        ZonedDateTime zoneTokyo = ZonedDateTime.now(TimeZone.getTimeZone("Asia/Tokyo").toZoneId());
        System.out.println(zoneTokyo);
    }

    public static void dateFormate(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dateFormatter.format(now));
    }

}
