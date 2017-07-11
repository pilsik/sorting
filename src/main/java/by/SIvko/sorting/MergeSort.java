package by.SIvko.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 32, 1, 5, 32, 5, 8, 3, 5};
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] firstArray = Arrays.copyOfRange(array,0,mid);
        int[] secondArray = Arrays.copyOfRange(array,mid,array.length);
        return mergeArrays(mergeSort(firstArray),mergeSort(secondArray)) ;
    }

    public static int[] mergeArrays(int[] firstArr, int[] secondArr) {
        int f_l = firstArr.length;
        int s_l = secondArr.length;
        int[] result = new int[f_l + s_l];
        for (int i = 0, f_i = 0, s_i = 0; i < result.length; i++) {
            if (f_l == f_i) result[i] = secondArr[s_i++];
            else if (s_l == s_i) result[i] = firstArr[f_i++];
            else if (firstArr[f_i] < secondArr[s_i]) result[i] = firstArr[f_i++];
            else result[i] = secondArr[s_i++];
        }
        return result;
    }
}
