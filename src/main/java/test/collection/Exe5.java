package test.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe5 {

    public static List<String> namesScanner() {
        List<String> listOfNames = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 imion: ");
        String name;
        for (int i = 0; i < 5; i++) {
            name = scanner.nextLine();
            listOfNames.add(name);
        }
        return listOfNames;
    }


    public static void printList(List<String> newList) {
        int i = 0;
        while (i <= newList.size() - 1) {
            System.out.println(newList.get(i));
            i++;
        }
    }


    public static void main(String[] args) {
        printList(namesScanner());
    }


}
