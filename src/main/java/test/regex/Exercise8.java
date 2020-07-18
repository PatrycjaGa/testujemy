package test.regex;

import java.util.regex.Pattern;

public class Exercise8 {

    public static boolean correctInvoice(String invoice){
        Pattern pattern = Pattern.compile("FV\\/1[0-9]{3}\\/[0-1]{1}[0-9]{1}\\/[0-9]{4}");
        boolean correct = pattern.matcher(invoice).matches();
        return correct;
    }

    public static void main(String[] args) {
        String invoiceNumber = "FV/1024/02/2018";
        System.out.println("Czy numer faktury jest zgodny" + (correctInvoice(invoiceNumber)));
    }
}
