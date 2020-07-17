package test.oop;

public class Exe16_17_18_19_22_23_24_26Person {

    private String name;
    private String surname;
    private int age;

    // zad 17 konstruktor bezparmatrowy
    public Exe16_17_18_19_22_23_24_26Person() {
    }

    //zad 18 konstruktor wszystkie mozliwe parametry
    public Exe16_17_18_19_22_23_24_26Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    //zad 22
    Exe20_21_25_27Address address;

    //zad 23 nowy konstruktor z adresem


    public Exe16_17_18_19_22_23_24_26Person(String name, String surname, int age, Exe20_21_25_27Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Exe20_21_25_27Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Exe20_21_25_27Address getAddress() {
        return address;
    }

    public void introduce(){
        System.out.println("Imie: " + name + "Nazwisko: " + surname);
    }


}
