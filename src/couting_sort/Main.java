package couting_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 2, 7, 5, 2};
        int k = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[k + 1];

        for (int num : arr) {
            count[num]++;
        }

        System.out.println("Array de contagem: " + Arrays.toString(count));

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}
