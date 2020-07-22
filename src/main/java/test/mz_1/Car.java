package test.mz_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car {

    protected String producer;
    protected String model;
    protected String color;
    protected int numberOfSeats;

    public Car() {
        this.numberOfSeats = 2;
    }

    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.numberOfSeats = 2;
    }

    public Car(String producer, String model, String color, int numberOfSeats) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }


}
