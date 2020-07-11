package test;

public class Exercise7 {
    public static void main(String[] args) {
        int n = 9;
        int r = 3;
        int[] arithemticalSequences = new int[n];
        arithemticalSequences[1] = 10;
        for (int i = 0; i < n ; i++ ){
            arithemticalSequences[i] = arithemticalSequences[1] + ((i-1)*r);
            System.out.println(arithemticalSequences[i]);
        }
    }
}
