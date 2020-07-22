package test.sda3;

import lombok.Getter;
import lombok.Setter;

@Getter

public class MyNumber {
    private Integer firstNumber;
    private Integer secondNumber;

    public MyNumber(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}
