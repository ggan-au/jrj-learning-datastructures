package algo.quicksort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] inputArray = { 12, 81, 74, 48, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
        quicksort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quicksort(int[] inputArray, int start, int end) {
        if (start < end) {
            int q = partition(inputArray, start, end);
            quicksort(inputArray, start, q-1);
            quicksort(inputArray, q+1, end);
        }
    }

    public static int partition(int[] inputArray, int start, int end) {
        int pivot = inputArray[end];
        int i = start - 1;  //6
        for (int j = start; j < end; j++) {
            if (inputArray[j] <= pivot) {   // 3 <= 8
                i++;
                int temp = inputArray[i];  // Start or array - Set to 3
                inputArray[i] = inputArray[j];  // Now start is 8
                inputArray[j] = temp;
            }
        }

        int temp = inputArray[i + 1];
        inputArray[i + 1] = inputArray[end];
        inputArray[end] = temp;
        return i + 1;

    }
}
