package test;

public class Exercise3 {
    public static void main(String[] args) {
        sum(1, 5);
    }

    public static void sum(int num1, int num2) {
        if (num1 < num2) {
            int result = 0;
            for (int i = num1; i <= num2; i++) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
