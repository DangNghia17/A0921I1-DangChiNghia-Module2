package ss14_sort_algortithm.bai_tap.SetupInsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 12, 55, 23, 6, 123, 51, 321};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }
}
