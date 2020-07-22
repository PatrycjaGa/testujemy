package test.mz_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Słoneczna", "Warszawa", "Polska",1, 3);
        Person young = new Person();
        young.setAddress(address);
        Person johny = new Person("Johny", "Bravo");
        Person ana = new Person("Ana", "Nowak", 25);
        Person old = new Person("old", "Japan", 135);
        johny.setAddress(address);
        ana.setAddress(address);
        old.setAddress(address);

        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(young);
        listOfPerson.add(johny);
        listOfPerson.add(ana);
        listOfPerson.add(old);

        System.out.println("size" + listOfPerson.size());

        if (!listOfPerson.isEmpty()) {
            Person person = listOfPerson.get(0);
            System.out.println("index 0 " + person.toString());
            System.out.println("index last " + listOfPerson.get(listOfPerson.size() - 1));

        }
        System.out.println("Limit wiekowy");

        for (Person person : listOfPerson) {
            System.out.println(person.toString());
        }

        System.out.println("Przefiltrowane");

        List<Person> ageFilter = Validator.filterPersons(listOfPerson);

        for (Person person : ageFilter) {
            System.out.println(person.toString());
        }
    }
}
