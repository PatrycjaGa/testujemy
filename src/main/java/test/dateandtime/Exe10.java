package test.dateandtime;

import java.time.LocalDate;

public class Exe10 {

    public static LocalDate localDate(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public static void main(String[] args) {
        System.out.println(localDate());
    }
}
