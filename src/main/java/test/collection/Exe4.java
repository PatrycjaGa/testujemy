package test.collection;

import java.util.ArrayList;
import java.util.List;

public class Exe4 {

    public static List<String> listOfNames() {
        List<String> names = new ArrayList<String>();
        names.add("Ana");
        names.add("John");
        names.add("Claudia");
        names.add("Kristin");
        return names;
    }

    public static void printListOfNames(List<String> nameList) {
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    public static void printListreversedly(List<String> nameList) {

            for (int i = nameList.size() - 1; i >= 0; i--) {
                System.out.println("Lista: " + nameList.get(i));
            }
        }



    public static void main(String[] args) {
        System.out.println(listOfNames());
        printListOfNames(listOfNames());
        printListreversedly(listOfNames());
    }
}
