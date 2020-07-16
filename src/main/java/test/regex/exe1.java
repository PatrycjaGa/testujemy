package test.regex;

import java.util.regex.Pattern;

public class exe1 {
    public static boolean isIdCorrect(String id){
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(id).matches();
    }

    public static boolean isEmail(String email){
        Pattern emailPattern = Pattern.compile("[0-9a-z \\.\\-]+@[0-9a-z \\.\\-]+");
        return emailPattern.matcher(email).matches();
    }

    public static boolean isPasswordCorrect(String password){
        Pattern passwordPattern = Pattern.compile("[A-Z \\s]+");
        return passwordPattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        System.out.println(isIdCorrect("545521445d"));
        System.out.println(isEmail("sss@ddd.pl"));
        System.out.println(isPasswordCorrect("A;"));

    }


}
