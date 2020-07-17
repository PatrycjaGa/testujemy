package test.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class Exe12 {
    public static Period periodBetweenTwoDates(){
        LocalDate firstDate = LocalDate.of(2017,1,1);
        LocalDate secondDate = LocalDate.of(2017,5,5);
        Period period = Period.between(firstDate,secondDate);
        return period;
    }

    public static void main(String[] args) {
        System.out.println("Różnica między datami wynosi: " + periodBetweenTwoDates().getYears() + " lat " + periodBetweenTwoDates().getMonths() + " miesiące " + periodBetweenTwoDates().getDays() + " dni");
    }
}
