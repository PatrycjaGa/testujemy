package test.sda3;

import org.w3c.dom.ls.LSOutput;

public class Calculator {

    public static String add(Integer firstNumber, Integer secondNumber, String i){
        Integer addNumbers;
        String result;
        if (i == " "){
        addNumbers = firstNumber + secondNumber;
        result =  addNumbers.toString();
        }else{
            result =  firstNumber.toString() +" + " + secondNumber.toString() +"*" +i;
        }
        return result;
    }
}
