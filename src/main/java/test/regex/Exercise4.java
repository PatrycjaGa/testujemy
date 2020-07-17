package test.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise4 {

    public static String putChain(){
        Scanner scanner = new Scanner(System.in);
        String chain = scanner.nextLine();
        return chain;
    }

    public static Boolean isCorrect(){
        Pattern correctPattern = Pattern.compile(".*ala.*");
        boolean correct = correctPattern.matcher(putChain()).matches();
        return correct;
    }

    public static void main(String[] args) {
        System.out.println(isCorrect());
    }


}
