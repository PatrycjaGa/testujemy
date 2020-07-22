package test.mz_1;

public class Main3 {
    public static void main(String[] args) {

        SportCar ferrari = new SportCar("Ferrari", "AAA", "Red", 2);
        Engine engine = ferrari.getEngine();

        //łapanie wyjatku
        try {
            engine.getCapacity();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            {
                System.out.println("Ten kod zawsze sie wykonuje");
            }
        }

    }
}
