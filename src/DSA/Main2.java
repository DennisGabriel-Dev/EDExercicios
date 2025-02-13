package DSA;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        int n = 100000;

        int[] array1 = new int[n];
        for (int i = 1; i < n; i++) {
            array1[i] = n - i;
        }
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
}
