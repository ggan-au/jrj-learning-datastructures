package algo.mergesort;

public class MergeSort {

    public static void mergeSort(int[] inputArray) {
        int inputSize = inputArray.length;
        if (inputSize < 2) return;

        int midPoint = inputSize / 2;
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[inputSize - midPoint];

        for (int i = 0; i < midPoint; i++) {
            leftArray[i] = inputArray[i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = inputArray[midPoint + i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(inputArray, leftArray, rightArray);
    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] < rightArray[j]) {
                inputArray[k++] = leftArray[i++];
            } else {
                inputArray[k++] = rightArray[j++];
            }
        }

        while (i < leftSize) inputArray[k++] = leftArray[i++];
        while (j < rightSize) inputArray[k++] = rightArray[j++];
    }

}
