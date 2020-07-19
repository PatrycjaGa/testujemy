package test.sda3;

public class Cat implements Animals {

    private String catsname;
    private String eatMouse;

    public Cat(String catsname, String eatMouse) {
        this.catsname = catsname;
        this.eatMouse = eatMouse;
    }
    public static String eatMouse(){
        return "aZjadłem X myszy";
    }


    @Override
    public String makeSound() {

        return this.catsname + " Maiu";
    }
}
