package algo.mergesort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};
        MergeSort.mergeSort(inputArray);
        Arrays.stream(inputArray).forEach(n -> System.out.print(n + " "));

    }
}
