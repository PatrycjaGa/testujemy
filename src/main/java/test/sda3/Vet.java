package test.sda3;

public class Vet{

    String sayHello(Cat catName ){
        return "Witaj " + catName.getCatsname();
    }

    String sayHello(Dog dogName){
        return "Witaj " + dogName.getDogName();
    }

    public String sayHello(Animals animalName){
        return "Witaj " + animalName.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
