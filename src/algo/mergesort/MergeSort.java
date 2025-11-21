package algo.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length-1);
    }

    public static void sort(int[] inputArray, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(inputArray, start, mid); // sort left half
        sort(inputArray, mid+1, end); // sort right half
        merge(inputArray, start, mid, end); // merge sorted results into the inputArray
        System.out.println("After merge: " + Arrays.toString(inputArray));
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        System.out.println("Start: " + start + " Mid: " + mid + " End: " + end);
        int left_cnt = mid - start + 1; //0 - 0 + 1 = 1
        int right_cnt = end - mid; //1 - 0 = 1
        System.out.println("left: " + left_cnt + " right: " + right_cnt);

        //Initialize both Left and Right arrays + Plus one additional slot for the large number at the end of the array
        int[] L = new int[left_cnt + 1];
        int[] R = new int[right_cnt + 1];

        //Fill left array with values
        for (int i = 0; i < left_cnt; i++) {
            System.out.println("Copying inputArray[" + (start + i) + "] into L[" + i + "]");
            L[i] = inputArray[start + i]; // should I really -1 here - index out of bounds on index 0?
        }

        //Fill right array with values
        for (int i = 0; i < right_cnt; i++) {
            System.out.println("Copying inputArray[" + (mid + i + 1) + "] into R[" + i + "]");
            R[i] = inputArray[mid + i + 1];
        }

        //Ensure last slot of array is the largest possible number;
        L[left_cnt] = Integer.MAX_VALUE;
        R[right_cnt] = Integer.MAX_VALUE;

        System.out.println("LEFT: " + Arrays.toString(L));
        System.out.println("LEFT: " + Arrays.toString(R));

        int i = 0, j = 0;
        int totalElements = end - start + 1;
        for (int k = 0; k < totalElements; k++) {
            if (L[i] < R[j]) {
                inputArray[start + k] = L[i];
                i++;
            } else {
                inputArray[start + k] = R[j];
                j++;
            }
        }
    }
}
