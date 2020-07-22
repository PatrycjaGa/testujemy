package test.sda3;

import lombok.Getter;

@Getter
public class Complex {

    private Integer Re;
    private Integer Im;
    private String i;

    public Complex(String i) {
        this.i = i;
    }

    public Complex(Integer re, Integer im) {
        Re = re;
        Im = im;
    }
}
