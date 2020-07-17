package test.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Exe6 {

        public static Integer howManyTimes(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę całkowita");
            int howNumber = scanner.nextInt();
            return howNumber;
        }

        public static void putNumbersToQueue(int howNumber){
            PriorityQueue<Integer> queueNumbers = new PriorityQueue<Integer>();
            Random randomNumbers = new Random();
            int randomNumber = 0;

            for (int i =0; i < howNumber; i++){
                randomNumber = randomNumbers.nextInt(99)+1;
                queueNumbers.add(randomNumber);
            }
            int iterator =1;

            while (! queueNumbers.isEmpty()){
                System.out.println(iterator + " wkolejce " + queueNumbers.poll());
                iterator++;

            }
        }


    public static void main(String[] args) {
        putNumbersToQueue(howManyTimes());
    }

    }

