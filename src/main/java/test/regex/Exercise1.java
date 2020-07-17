package test.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise1 {


    public static void isNumber(String s){
        int even;
        Pattern isPattern = Pattern.compile("[0-9]+");
        boolean matches = isPattern.matcher(s).matches();

        if (matches){
            int newChain = Integer.parseInt(s);
            even = newChain % 2;
            if (even == 0){
                System.out.println("Wpisany ciag jest liczba parzystą");
            }else
            System.out.println("Wpisany ciąg nie jest liczbgą parzystą");

        }else
            System.out.println("Wpisany ciag nie jest liczbą");

        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ciag znaków");
        final String characterString = scanner.nextLine();
        isNumber(characterString);
    }

    }


