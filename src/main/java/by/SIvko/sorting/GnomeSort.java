package by.SIvko.sorting;

import java.util.Arrays;

public class GnomeSort {
    public static void main(String[] args) {
        int[] array = {1, 32, 1, 5, 32, 5, 8, 3, 5};
        System.out.println(Arrays.toString(gnomeSort(array)));
    }

    public static int[] gnomeSort(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (i == 0 || array[i - 1] <= array[i]) {
                i++;
            } else {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                i--;
            }
        }
        return array;
    }
}
