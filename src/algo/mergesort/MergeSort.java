package algo.mergesort;


import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        //if only 1 element return;
        if (inputLength < 2) {
            return;
        }

        //create arrays
        int midPoint = inputLength / 2;
        int[] leftSide = new int[midPoint];
        int[] rightSide = new int[inputLength - midPoint]; //9 - 4 = 5

        //Fill leftHalf
        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = inputArray[i];
        }

        //Fill rightHalf
        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = inputArray[midPoint + i];
        }

        //call recursive methods
        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(inputArray, leftSide, rightSide);

    }


    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        //get array sizes for left and right half
        int leftSize = leftHalf.length;
        int righSize = rightHalf.length;

        //Sort from lowest to highest into inputArra - all in one while loop. Remember to set i,j,k
        int i = 0, j = 0, k =0;
        while (i < leftSize && j < righSize) {
            if (leftHalf[i] < rightHalf[j]) {
                inputArray[k++] = leftHalf[i++];
            } else {
                inputArray[k++] = rightHalf[j++];
            }
        }

        //Check for leftovers and add them to inputArray
        while (i < leftSize) {
            inputArray[k++] = leftHalf[i++];
        }

        while (j < righSize) {
            inputArray[k++] = rightHalf[j++];
        }



    }
}
