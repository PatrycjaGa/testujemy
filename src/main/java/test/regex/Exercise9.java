package test.regex;

import test.Exercise6_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise9 {

    public static List<String> splitChain(String chain) {
        List<String> listWithWords = new ArrayList<String>();
        for (String index : chain.split(" ")){
            listWithWords.add(index);
        }
        return listWithWords;
    }

    public static void tablePrinter(List<String> array) {
        for (String index : array) {
            System.out.print("[" + index + "] ");
        }

        System.out.println("");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz tekst: ");
        String chain = scanner.nextLine();
        List<String> array = splitChain(chain);
        tablePrinter(array);
        System.out.println("Ilość słów: " + array.size());

    }
}
