package test.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Exe13 {
    public static Duration durationBetweeTwoTimes(){
        LocalTime firstTime = LocalTime.of(14,11);
        LocalTime secondTime = LocalTime.of(18,41);
        Duration duration = Duration.between(firstTime,secondTime);
        return duration;
    }

    public static void main(String[] args) {
        System.out.println("Różnica między datami to: " + durationBetweeTwoTimes().getSeconds() + " sekund");
    }
}
