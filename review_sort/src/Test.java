import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 5, 4, 4};
//        Sort.insertSort(arr);
//        System.out.println(Arrays.toString(arr));
//        int[] arr2 = {4, 1, 3, 9, 2, 8, 7, 5, 6, 5};
//        Sort.shell(arr2);
//        System.out.println(Arrays.toString(arr2));
//        int[] arr3 = {1, 5, 2, 5, 4};
//        Sort.selectSort(arr3);
//        System.out.println(Arrays.toString(arr3));
//        int[] arr4 = {5, 1, 2, 5, 4};
//        Sort.selectSort2(arr4);
//        System.out.println(Arrays.toString(arr4));
//        int[] arr5 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Sort.heapSort(arr5);
//        System.out.println(Arrays.toString(arr5));
//        int[] arr6 = {5, 1, 3, 7, 9, 8, 6, 2, 4, 5};
//        Sort.bubbleSort(arr6);
//        System.out.println(Arrays.toString(arr6));
        int[] arr7 = {6, 1, 2, 7, 9, 3, 4, 5, 6, 8};
        Sort.mergeSortNor(arr7);
        System.out.println(Arrays.toString(arr7));
//
//        int[] arr = new int[10];
//        getRandomArr(arr);
//        testQuickSort1(arr);
//        testQuickSort2(arr);
    }

    public static void getRandomArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }
    }

    public static void testQuickSort1(int[] arr) {
        int[] tmpArr = Arrays.copyOf(arr, arr.length);
        long start = System.currentTimeMillis();
        Sort.quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("未加优化的快速排序耗时：" + (end - start));
    }

    public static void testQuickSort2(int[] arr) {
        int[] tmpArr = Arrays.copyOf(arr, arr.length);
        long start = System.currentTimeMillis();
//        Sort.quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(tmpArr));
        Sort.quickSort2(tmpArr, 0, arr.length - 1);
        System.out.println(Arrays.toString(tmpArr));
        long end = System.currentTimeMillis();
        System.out.println("加了优化的快速排序耗时：" + (end - start));
    }
}
