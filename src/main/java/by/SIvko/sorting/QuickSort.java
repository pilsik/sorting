package by.SIvko.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 32, 1, 5, 32, 5, 8, 3, 5};
        System.out.println(Arrays.toString(quickSort(array, 0, array.length-1)));
    }

    public static int[] quickSort(int[] array, int startIndex, int endIndex) {
        int mid = (startIndex + (endIndex - startIndex)) / 2;
        int basic = array[mid];
        int i = startIndex;
        int j = endIndex;
        while (i <= j) {
            while (array[i] < basic) i++;
            while (array[j] > basic) j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (startIndex < j) quickSort(array, startIndex, j);
        if (startIndex > i) quickSort(array, i, endIndex);
        return array;
    }
}
