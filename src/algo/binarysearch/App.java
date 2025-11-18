package algo.binarysearch;

public class App {
    public static void main(String[] args) {
        int[] myArray = new int[] {1,5,70,80,101,1000,3121,63990,32232232,123123213};
        int index = binarySearch(myArray, 101);
        System.out.println("The found value is: " + myArray[index]);
    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midpoint = (start + end) / 2;
            if (arr[midpoint] == value) {
                return midpoint;
            }
            if (arr[midpoint] > value) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
        }
        return -1;
    }
}
