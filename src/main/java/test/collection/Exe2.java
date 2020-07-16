package test.collection;

import java.util.ArrayList;
import java.util.List;

public class Exe2 {

    public static void listOfFigures(){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(55);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size() -1));
    }

    public static void main(String[] args) {
        listOfFigures();

    }
}
