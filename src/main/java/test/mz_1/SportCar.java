package test.mz_1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SportCar extends Car {

    private Engine engine;

    public SportCar(String producer, String model, String color, Engine engine) {
        super(producer, model, color);
        this.engine = engine;
    }

    public SportCar(String producer, String model, String color, Engine engine, int numOfSeats) {
        super(producer, color, model, numOfSeats);
        this.engine = engine;
    }

    //przykład z błedem
    public SportCar(String producer, String model, String color, int numOfSeats) {
        super(producer, color, model, numOfSeats);

    }

    @Override
    public String toString() {
        return "SportCar{" +
                "engine=" + engine +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
