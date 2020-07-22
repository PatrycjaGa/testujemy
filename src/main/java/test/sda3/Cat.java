package test.sda3;

import lombok.Getter;

@Getter
public class Cat implements Animals, Movable {

    private String catsname;


    public Cat(String catsname) {
        this.catsname = catsname;
    }

    public void eatMouse() {
        System.out.println(this.catsname + " Zjadłem X myszy");
    }


    @Override
    public String makeSound() {

        return this.catsname + " Maiu";
    }

    @Override
    public String getName() {
        return catsname;
    }

    @Override
    public String move() {
        return " ide";
    }
}
