package by.SIvko.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {1, 32, 1, 5, 32, 5, 8, 3, 5};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int min = i - 1;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i - 1];
            array[i - 1] = temp;
        }
        return array;
    }
}
