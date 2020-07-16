package test.collection;

import java.util.ArrayList;
import java.util.List;

public class Exe3 {

    public static List listOfFloatingPointNumbers(){
        List<Double> newArray = new ArrayList<Double>();
        newArray.add(4.5);
        newArray.add(2.6);
        newArray.add(5.8);
        newArray.add(1.7);
        newArray.add(9.45);
        newArray.add(5.5);
        newArray.add(5.0);
        newArray.add(1.8);
        newArray.add(9.9);
        newArray.add(4.5);
        return newArray;
    }

    public static double sumOfElements(List<Double> arrayList){
        double sum = 0.0;
        sum = arrayList.get(0) + arrayList.get(arrayList.size()- 1);
        return sum;
    }

    public static double productOfElements(List<Double> arrayList){
        double product;
        product = arrayList.get(0) * arrayList.get(arrayList.size()- 1);
        return product;
    }

    public static double quotientOfElements(List<Double> arrayList){
        double quotient;
        quotient = arrayList.get(2) / arrayList.get(arrayList.size()- 2);
        return quotient;
    }

    public static void main(String[] args) {
        System.out.println("Lista elementów: " + listOfFloatingPointNumbers());
        System.out.println("Suma pierwszego i ostatniego elementu: " + sumOfElements(listOfFloatingPointNumbers()));
        System.out.println("Iloczyn pierwszego i ostatniego elementu: " + productOfElements(listOfFloatingPointNumbers()));
        System.out.println("Iloraz drugiego i przedostatniego elementu: " + quotientOfElements(listOfFloatingPointNumbers()));
    }
}
