package test.sda3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat bruenk  = new Cat("Bruno", Cat.eatMouse());
        Cat filemon  = new Cat("Filemon", Cat.eatMouse());
        Cat bonifacy  = new Cat("Bonifacy", Cat.eatMouse());
        ArrayList<Animals> lisOfCats = new ArrayList<Animals>();
        lisOfCats.add(bruenk);
        lisOfCats.add(filemon);
        lisOfCats.add(bonifacy);

        for (Animals animal : lisOfCats){
            System.out.println(animal.makeSound());
        }

    }
}
