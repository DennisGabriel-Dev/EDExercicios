package DSA;

import java.util.Arrays;

public class DSA {
    public static void counting_sort(int[] array){
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
}
