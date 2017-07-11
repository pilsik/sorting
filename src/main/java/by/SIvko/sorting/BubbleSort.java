package by.SIvko.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1, 32, 1, 5, 32, 5, 8, 3, 5};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
