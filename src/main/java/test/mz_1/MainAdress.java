package test.mz_1;

public class MainAdress {

    public static void main(String[] args) {
        Address address = new Address("Długa", "Kraków", "Polska",20, 5);
        System.out.println("getter: " + address.getStreet());
        System.out.println(address.toString());
        address.setFlatNo(50);
        address.setHomeNo(66);
        address.setStreet("Krótka");
        System.out.println("Po zmianie " + address.toString());
        System.out.println("getter: " + address.getStreet());
        System.out.println("=========");
        Person examplePerson = new Person("Ana", "Nowak", 25, address);
        System.out.println("Przed przeprowadzka: " + examplePerson.toString());
        Address exampleAddress = new Address("Słoneczna", "Warszawa", "Polska",1, 3);
        examplePerson.setAddress(exampleAddress);
        System.out.println("Po przeprowadzce: " + examplePerson.toString());



    }
}
