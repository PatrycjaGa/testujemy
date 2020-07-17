package test.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exe15 {

    public static String timeInBydgoszcz(){
        LocalDateTime localDateTime =LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy 'roku', EEEE HH:mm:ss");
        String formattedString = localDateTime.format(dateTimeFormatter);
        return  formattedString;
    }

    public static void main(String[] args) {
        System.out.println(timeInBydgoszcz());
    }
}
