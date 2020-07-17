package test.regex;

import java.util.regex.Pattern;

public class Exercise7 {
    public static boolean isCorrectSoftwareSerialNumber(String serialNumber){
        Pattern pattern = Pattern.compile("[A-Z|\\&|A-Z]{5}-[A-Z|0-9]{5}-[A-Z|0-9]{5}-[A-Z|0-9]{5}-[A-Z|0-9]{5}");
        boolean correct = pattern.matcher(serialNumber).matches();
        return correct;
    }

    public static void main(String[] args) {
        String serialNumber = "CFG&Y-TYH67-GH56T-UIO99-RY4RT";
        System.out.println("Czy numer seryjny ma poprawna forme: " + isCorrectSoftwareSerialNumber(serialNumber));
    }
}
