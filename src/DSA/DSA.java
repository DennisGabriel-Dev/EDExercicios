package DSA;

import java.util.Arrays;

public class DSA {
    public static void countingSort(int[] array){
        int A[] = array;
        int k = Arrays.stream(A).max().getAsInt();
        int C[] = new int[k];
        int B[] = new int[A.length];
        // A = [7, 8, 6, 2]
        for (int i = 0; i < A.length; i++) {
            C[A[i] - 1] ++;
        }

        for(int i = 1; i < C.length; i++) {
            C[i] += C[i - 1];
        }

        for (int i = A.length - 1; i >= 0 ; i--) {
            B[C[A[i] - 1] - 1] = A[i];
            C[A[i] - 1]--;
        }

        System.out.println(Arrays.toString(B));

    }

    public static void bubbleSort(int[] arr) {
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

        System.out.println(Arrays.toString(arr));
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
        quickSortHelper(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
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

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // FINISH QUICK SORT
}
