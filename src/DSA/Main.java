package DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array1[] = {7, 8, 6, 2, 3, 5, 2, 3, 4, 5};
        long startTime = System.nanoTime();

        // DSA.countingSort(array1);

       // DSA.bubbleSort(array1);
//
//        DSA.mergeSort(array1);
//
//       System.out.println(Arrays.toString(array1));

       DSA.quickSort(array1);


        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime);
        System.out.println("Time: " + executionTime + "ms");
    }
}
