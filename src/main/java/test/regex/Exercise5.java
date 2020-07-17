package test.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise5 {

    public static String putDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz date: ");
        String date = scanner.nextLine();
        return date;
    }

    public static boolean dateIsCorrect(){
        Pattern datePattern = Pattern.compile("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}r\\.");
        boolean isCorrect = datePattern.matcher(putDate()).matches();
        return isCorrect;
    }

    public static void main(String[] args) {
        System.out.println("Czy format daty jest poprawny: " + dateIsCorrect());
    }

}
