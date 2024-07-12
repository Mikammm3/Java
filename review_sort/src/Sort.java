public class Sort {

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > tmp) {
                    // 比 i 大，往后挪
                    arr[j + 1] = arr[j];
                } else {
                    // 比 i 小，放后一个位置
                    // arr[j + 1] = tmp;
                    // 说明前面的元素都有序了
                    break;
                }
            }
            arr[j + 1] = tmp;
            // 如果 i 之前的元素都比i要大，
            // 那么 i 就应该放到最前面
            // 此时 j 一直--，j 则会变成 -1
        }
    }
}
