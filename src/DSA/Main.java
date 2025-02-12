package DSA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[101];
        int[] base = {15, 17, 87, 100, 65, 30, 21, 27, 16, 15};

        // Preencher o array com a sequência fixa
        for (int i = 0; i < array1.length; i++) {
            array1[i] = base[i % base.length]; // Repete a sequência
        }

        System.out.println(Arrays.toString(array1));

        long startTime = System.nanoTime();
       // DSA.countingSort(array1);

       // DSA.bubbleSort(array1);
//
      // DSA.mergeSort(array1);
//

      // DSA.quickSort(array1);

        long endTime = System.nanoTime();

        //System.out.println(Arrays.toString(array1));
        long executionTime = (endTime - startTime);
        System.out.println("Time: " + executionTime + "ns");
    }
}
