package algo.mergesort;

public class MergeSort {

    public static void mergeSort(int[] inputArray) {
        int inputSize = inputArray.length;
        if (inputSize < 2) {
            return;
        }

        int midPoint = inputSize / 2;
        int[] leftSide = new int[midPoint];
        int[] rightSide = new int[inputSize - midPoint];

        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = inputArray[i];
        }

        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = inputArray[midPoint + i];
        }

        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(inputArray, leftSide, rightSide);
    }

    public static void merge(int[] inputArray, int[] leftSide, int[] rightSide) {
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftSide[i] < rightSide[j]) {
                inputArray[k++] = leftSide[i++];
            } else {
                inputArray[k++] = rightSide[j++];
            }
        }

        while (i < leftSize) inputArray[k++] = leftSide[i++];
        while (j < rightSize) inputArray[k++] = rightSide[j++];
    }

}
