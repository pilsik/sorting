package by.SIvko.sorting;

import java.util.Arrays;

/**
 * Сортировка вставками (англ. Insertion sort) — алгоритм сортировки, в котором элементы входной последовательности
 * просматриваются по одному, и каждый новый поступивший элемент размещается в подходящее место среди ранее
 * упорядоченных элементов. Вычислительная сложность —O(n^{2}).
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {1, 32, 1, 5, 32, 5, 8, 3, 5};
        System.out.println(Arrays.toString(insertSort(array)));
    }

    public static int[] insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
