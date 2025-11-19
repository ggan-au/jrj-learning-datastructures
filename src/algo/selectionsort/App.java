package algo.selectionsort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
        Arrays.stream(myArray).forEach(num -> System.out.print(num + " "));
    }

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;

        }
        return arr;
    }
}
