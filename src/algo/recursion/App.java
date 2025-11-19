package algo.recursion;

public class App {
    public static void main(String[] args) {
       // reduceByOne(10);
        int[] myArray = new int[] {1,2,3,4,5,6,7};
//        int index = recursiveLinearSearch(myArray, 0, 8);
        int index = recursiveBinarySearch(myArray, 0, myArray.length, 7);
        System.out.println("The number 4 is located at index: " + index);
    }

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n - 1);
        }
        System.out.println("Completed Call: " + n);
    }

    public static int recursiveLinearSearch(int[] arr, int index, int value) {
        if (index > arr.length - 1) {
            return -1;
        } else if (arr[index] == value) {
            return index;
        } else {
            return recursiveLinearSearch(arr, index + 1, value);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
        if (start > end) {
            return -1;
        }

        int pos = (start + end) / 2;

        if (arr[pos] == value) {
            return pos;
        } else if (arr[pos] > value) {
            return recursiveBinarySearch(arr, start, pos-1, value);
        } else {
            return recursiveBinarySearch(arr, pos+1, end, value);
        }
    }
}
