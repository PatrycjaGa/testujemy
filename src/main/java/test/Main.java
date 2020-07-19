package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat garfield = new Cat();
//        Cat filemon = new Cat("Mrau");
//        System.out.println(Cat.testMakeSound());
//
//        System.out.println(garfield.makeSound());
//        System.out.println(filemon.makeSound());

//        Cow mucka = new Cow("Mooo");
//        System.out.println(mucka.makeSound());
//        Dog reksio = new Dog("Hau");
//        System.out.println(reksio.makeSound());
//
//        filemon.setAge(5);
//        System.out.println(filemon.getAge());
        Cat garfield = new Cat();
        Cat filemon = new Cat();
        Cat mruczek = new Cat();
        Cat mamba = new Cat();
        Dog reksio = new Dog("Hau");
        Dog reks = new Dog("Woof");
        Cow mucka = new Cow("Mooo");

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(garfield);
        listOfAnimals.add(filemon);
        listOfAnimals.add(mruczek);
        listOfAnimals.add(mamba);
        listOfAnimals.add(reksio);
        listOfAnimals.add(reks);
        listOfAnimals.add(mucka);

        for (Animal animal : listOfAnimals){
            System.out.println(animal.makeSound());

        }

    }
}
