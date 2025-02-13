package DSA;

import java.util.Arrays;
import java.util.Stack;

public class DSA {
    public static void countingSort(int[] array) {
        int A[] = array;
        long startTime = System.nanoTime();
        int k = Arrays.stream(A).max().getAsInt();
        int C[] = new int[k + 1];
        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            C[A[i]]++;
        }

        for (int i = 1; i < C.length; i++) {
            C[i] += C[i - 1];
        }

        for (int i = A.length - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }


        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime);
        System.out.println("Time counting sort: " + executionTime + "ns");
    }


    public static void bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        long endTime = System.nanoTime();

        //System.out.println(Arrays.toString(array1));
        long executionTime = (endTime - startTime);
        System.out.println("Time bubble sort: " + executionTime + "ns");
    }


    // MERGE SORT
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    // FINISH MERGE SORT


    // QUICK SORT
    public static void quickSort(int[] arr) {
        long startTime = System.nanoTime();
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, arr.length - 1});

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            int low = range[0], high = range[1];

            if (low < high) {
                int pi = partition(arr, low, high);
                    if (pi - 1 > low) stack.push(new int[]{low, pi - 1});
                if (pi + 1 < high) stack.push(new int[]{pi + 1, high});
            }
        }
        long endTime = System.nanoTime();

        //System.out.println(Arrays.toString(array1));
        long executionTime = (endTime - startTime);
        System.out.println("Time quick sort: " + executionTime + "ns");
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = medianOfThree(arr, low, high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static int medianOfThree(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        // Ordena os três valores e usa o do meio como pivô
        if (arr[mid] < arr[low]) swap(arr, mid, low);
        if (arr[high] < arr[low]) swap(arr, high, low);
        if (arr[high] < arr[mid]) swap(arr, high, mid);

        swap(arr, mid, high); // Coloca o pivô na posição `high`
        return arr[high];
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // FINISH QUICK SORT
}
