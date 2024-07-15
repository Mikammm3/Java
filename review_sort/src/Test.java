import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 4};
        Sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {4, 1, 3, 9, 2, 8, 7, 5, 6, 5};
        Sort.shell(arr2);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {1, 5, 2, 5, 4};
        Sort.selectSort(arr3);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = {5, 1, 2, 5, 4};
        Sort.selectSort2(arr4);
        System.out.println(Arrays.toString(arr4));
        int[] arr5 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Sort.heapSort(arr5);
        System.out.println(Arrays.toString(arr5));
        int[] arr6 = {5, 1, 3, 7, 9, 8, 6, 2, 4, 5};
        Sort.bubbleSort(arr6);
        System.out.println(Arrays.toString(arr6));
        int[] arr7 = {6, 1, 2, 7, 9, 3, 4, 5, 6, 8};
        Sort.quickSort(arr7, 0, arr7.length - 1);
        System.out.println(Arrays.toString(arr7));
    }
}
