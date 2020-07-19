package test.mz_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Validator {
    public static List<Person> filterPersons(List<Person> listOfPerson) {
        List<Person> filtered = new LinkedList<>();
        for (Person person : listOfPerson) {
            if (person.getAge() <= Person.MAX_AGE) {
                filtered.add(person);
            }
        }
        return filtered;
    }
}
