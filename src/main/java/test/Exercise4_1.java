package test;

public class Exercise4_1 {
    public static int[] switchTable(int[] arrayOne){
        if(arrayOne.length > 1){
            int tmp = arrayOne[0];
            arrayOne[0] = arrayOne[arrayOne.length - 1];
            arrayOne[arrayOne.length - 1] = tmp;
        }
        return arrayOne;
    }

    public static void printArray(int[] array) {
        for(int value : array){
            System.out.print("[" + value + "] ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] beforMmyArray = {12, 7, 19};
        printArray(beforMmyArray);
        int[] afterArray = switchTable(beforMmyArray);
        Exercise4_1.printArray(afterArray);
                
    }
}
