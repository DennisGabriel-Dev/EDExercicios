package DSA;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array1 = IntStream.rangeClosed(1, 1000).toArray();
        shuffleArray(array1);
        int[] array2 = array1.clone();
        int[] array3 = array1.clone();
        int[] array4 = array1.clone();
        int[] array5 = array1.clone();

        System.out.println(Arrays.toString(array1));

        DSA.countingSort(array2);

        DSA.bubbleSort(array3);
        long startTime = System.nanoTime();
        DSA.mergeSort(array4);
        long endTime = System.nanoTime();

       // System.out.println(Arrays.toString(array1));
        long executionTime = (endTime - startTime);
        System.out.println("Time merge sort: " + executionTime + "ns");


        DSA.quickSort(array5);
    }


    private static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
