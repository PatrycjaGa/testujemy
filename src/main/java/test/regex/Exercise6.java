package test.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise6 {
    public static String putSerialNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz numer seryjny: ");
        String serialNumber = scanner.nextLine();
        return serialNumber;
    }

    public static boolean isSerialNumber(){
        Pattern serialNumberPattern = Pattern.compile("[A-Z]{3}[0-9]{5}[a-z]{1}[A-Z]{1}");
        boolean isCorrect = serialNumberPattern.matcher(putSerialNumber()).matches();
        return isCorrect;
    }

    public static void main(String[] args) {
        System.out.println("Czy numer seryjny jest poprawny: " + isSerialNumber());
    }
}
