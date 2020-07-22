package test.mz_1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Engine v8 = new Engine(7.0,400, 15);

        SportCar bmw = new SportCar("BMW", "X7", "black", v8, 7);

        System.out.println(bmw.toString());

        Car porsche = new SportCar("Porsche", "Panamera", "red", v8, 4);
        //rzutowanie w góre sport car na car to rzutuje w góre
        // jezeli Car -> SportCar - rzutowanie w dól, dostaje dostep do metod zdefiniowanych tylko w SportCar

        SportCar sportsCar = (SportCar) porsche;
        List<SportCar> sportCarsList = new ArrayList<>();
        sportCarsList.add(bmw);
        sportCarsList.add((SportCar) porsche);

        //przykład rzutowania
//        for (SportCar car : sportCarsList){
//            car.getEngine();
//        }

    }
}
