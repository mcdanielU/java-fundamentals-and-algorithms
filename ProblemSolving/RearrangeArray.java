package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
    public static void rearrangeArray(int[] arr, int index) {
        int pivot = arr[index];
        List<Integer> ltp = new ArrayList<>();
        List<Integer> gtp = new ArrayList<>();

        // Separate elements based on their comparison with the pivot
        for (int num : arr) {
            if (num < pivot) {
                ltp.add(num);
            } else {
                gtp.add(num);
            }
        }

        // Combine the lists back into the original array
        int i = 0;
        for (int num : ltp) {
            arr[i++] = num;
        }
        for (int num : gtp) {
            arr[i++] = num;
        }
    }

    public static void main(String[] args) {
        int[] A = {-3, 0, -1, 1, 1, 1, -5, -2, 4, 2};
        int index = 3;  // Pivot index

        rearrangeArray(A, index);

        // Print the rearranged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}