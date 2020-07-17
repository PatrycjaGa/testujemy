package test.dateandtime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Exe14 {
    public static ZonedDateTime timeInTokyo(){
        ZonedDateTime timeDateInTokyo = ZonedDateTime.now(TimeZone.getTimeZone("Asia/Tokyo").toZoneId());
        return timeDateInTokyo;
    }

    public static void main(String[] args) {
        System.out.println("W Tokyo jest: " + timeInTokyo());
    }
}
