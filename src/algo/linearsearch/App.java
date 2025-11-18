package algo.linearsearch;

public class App {
    public static void main(String[] args) {
        int[] myArray = new int[]{3,2,4,55,4,1,23,6,33,23};
        System.out.println(linearSearch(myArray, 55));
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
