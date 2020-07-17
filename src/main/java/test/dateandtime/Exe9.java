package test.dateandtime;

import java.time.LocalTime;

public class Exe9 {
    public static LocalTime localTime(){
        LocalTime localTime = LocalTime.now();
        return localTime;
    }

    public static void main(String[] args) {
        System.out.println(localTime());
    }



}
