package DSA;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        var n = 100_000;

        int[] array1 = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array1[i] = i;
        }

        System.out.println(Arrays.toString(array1));
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
