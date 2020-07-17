package test.regex;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise3 {

    public static String putLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login ");
        String login = scanner.nextLine();
        return login;
    }

    public static void isLogin(){
        Pattern loginPattern = Pattern.compile("[a-zA-z0-9]{8,16}");
        boolean isMatches = loginPattern.matcher(putLogin()).matches();
        if (isMatches == false){
            System.out.println("Wprowadziłes niepoprawny login");
        }
        System.out.println("Login jest poprawny");

    }

    public static void main(String[] args) {
        isLogin();
    }
}
