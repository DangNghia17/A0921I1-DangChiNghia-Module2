package ss14_sort_algortithm.thuc_hanh.SetupBubbleSort;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 312, 123, 534, 67, 8, 998, 35, 6554, 44, 87, 56, 3, 434, 34, 567, 4, 8, 5};
        System.out.println("Mảng khi chưa sắp xếp : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        bubbleSort(arr);

        System.out.println("\nMảng sau khi sắp xếp :");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}

