package test.sda3;

import lombok.Getter;

@Getter
public class Complex {

    private Integer Re;
    private Integer Im;
    private String i;

    public Complex(Integer re, Integer im, String i) {
        Re = re;
        Im = im;
        this.i = i;
    }
}
