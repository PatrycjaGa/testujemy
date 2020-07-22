package test.sda3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat bruenk  = new Cat("Bruno");
        Cat filemon  = new Cat("Filemon");
        Cat bonifacy  = new Cat("Bonifacy");
        Dog burek = new Dog("Burek");
        Dog szarik = new Dog("Szarik");

        Vet vet = new Vet();
        System.out.println(vet.sayHello(bonifacy));

        ArrayList<Animals> lisOfAnimals = new ArrayList<Animals>();
        lisOfAnimals.add(bruenk);
        lisOfAnimals.add(filemon);
        lisOfAnimals.add(bonifacy);
        lisOfAnimals.add(burek);
        lisOfAnimals.add(szarik);

        bonifacy.eatMouse();
        System.out.println(bonifacy.move());



        for (Animals animal : lisOfAnimals){
            System.out.println(animal.makeSound());

        }

    }
}
