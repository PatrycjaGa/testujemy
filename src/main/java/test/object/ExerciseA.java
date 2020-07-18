package test.object;

import java.util.*;

public class ExerciseA {
    public static void main(String[] args) {
//        exMap();
//        exSet();
//        exList();
         Set<String> returnExamples = exe2();
         for (String name : returnExamples){
             System.out.println("Hello: " + name);
         }

    }

    public static void exMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Anna");
        map.put(2, "Jan");
        map.put(3, "Michał");
        System.out.println(map.get(2));
        System.out.println(map.size());
        map.put(2, "Antoni");
        System.out.println(map.get(2));
        System.out.println(map.size());
    }

    public static void exList() {
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Patrycja");
        listOfNames.add("Michał");
        listOfNames.add("Anna");

        System.out.println(listOfNames.size());
        listOfNames.add("Anna");
        System.out.println(listOfNames.size());

        for (String name : listOfNames) {
            System.out.println("Hello: " + name);
        }
    }

    public static Set<String> exe2() {
        Set<String> setExamples = new HashSet<>();
        setExamples.add("Ana");
        setExamples.add("Jane");
        System.out.println("Size: " + setExamples.size());

        return setExamples;
    }

    public static void exSet() {
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Anna");
        setOfNames.add("JAn");
        setOfNames.add("Dawid");

        System.out.println(setOfNames.size());
        setOfNames.add("Anna");
        System.out.println(setOfNames.size());


    }


}
