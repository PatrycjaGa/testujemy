package test.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {
    public static String putPostCode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy: ");
        String postCode = scanner.nextLine();
        return postCode;
    }

    public static void isPostCode(){
        Pattern postCodePattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        boolean isTrue = postCodePattern.matcher(putPostCode()).matches();
        System.out.println(isTrue);
    }

    public static void main(String[] args) {
        isPostCode();
    }
}
