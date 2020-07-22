package test.sda3;

import lombok.Getter;

@Getter
public class Dog implements Animals {

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public String makeSound() {
        return this.dogName + " Hau HAu";
    }

    @Override
    public String getName() {
        return dogName;
    }
}
