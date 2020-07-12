package test;

public class Exercise3_1 {
    public static int sumaOfCalculation(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
         int result = sumaOfCalculation(1,4);
        System.out.println(result);
    }
}
