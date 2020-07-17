package test.dateandtime;

import java.time.LocalDateTime;

public class Exe11 {

    public static LocalDateTime localDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return  localDateTime;
    }

    public static void main(String[] args) {
        System.out.println(localDateTime());
    }
}
