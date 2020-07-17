package test.oop;

public abstract class Car {
    String producer;
    String model;
    String color;
    int setNumber;
    String engine;

    public Car(int setNumber) {
        this.setNumber = 2;
    }

    public Car(String producer, String model, String color, String engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
}
