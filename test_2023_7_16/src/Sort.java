import java.util.Stack;

public class Sort {


    /**
     * 时间复杂度：
     * 最好情况：数据完全有序的时候 1 2 3 4 5 O(N)
     * 最坏情况：数据完全逆序的时候 5 4 3 2 1 O(N^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > tmp) {
                    //比i大，往后挪
                    arr[j + 1] = arr[j];
                } else {
                    //比i小，放后一个位置
                    //arr[j + 1] = tmp;
                    //说明前面的元素都有序了
                    break;
                }
            }
            arr[j + 1] = tmp;
            //如果i之前的元素都比i要大，
            //那么i就应该放到最前面
            //此时j一直--，j则会变成-1
        }
    }


    /**
     * 时间复杂度：
     * n^1.3 - n^1.5
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     *
     * @param arr
     */
    public static void shellSort(int[] arr) {
        int gap = arr.length;
        while (gap > 1) {
            gap /= 2;
            shell(arr, gap);
        }
        //shell(arr, gap);
    }

    private static void shell(int[] arr, int gap) {
        for (int i = gap; i < arr.length; i++) {
            int j = i - gap;
            int tmp = arr[i];
            for (; j >= 0; j -= gap) {
                if (arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + gap] = tmp;
        }
    }


    /**
     * 时间复杂度：不管最好还是最坏 都是O(N^2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定的排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }


    public static void selectSort2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left + 1; i <= right; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[left];
            arr[left] = tmp;
            if (maxIndex == left) {
                //如果left是最大值，则left的值已经交换到了minIndex的位置
                maxIndex = minIndex;
            }
            tmp = arr[maxIndex];
            arr[maxIndex] = arr[right];
            arr[right] = tmp;
        }
    }


    /**
     * 时间复杂度：O(N*logN)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     *
     * @param arr
     */
    public static void heapSort(int[] arr) {
        createBigHeap(arr);
        int len = arr.length - 1;
        while (len > 0) {
            //交换
            int tmp = arr[len];
            arr[len] = arr[0];
            arr[0] = tmp;

            //向下调整
            shiftDown(arr, 0, len);
            len--;
        }
    }

    private static void createBigHeap(int[] arr) {
        //找到最后一颗子树
        for (int parent = (arr.length - 1 - 1) / 2; parent >= 0; parent--) {
            shiftDown(arr, parent, arr.length);
        }
    }

    private static void shiftDown(int[] arr, int parent, int len) {
        int child = 2 * parent + 1;//左孩子
        while (child < len) {
            if (child + 1 < len && arr[child + 1] > arr[child]) {
                child++;
            }
            if (arr[parent] < arr[child]) {
                //交换
                int tmp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                //说明已经是大根堆了
                break;
            }
        }
    }


    /**
     * 时间复杂度：
     * 最好情况：O(N)
     * 最坏情况：O(N^@)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        //确定趟数
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flg = true;//假设有序
            //一趟比较多少次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flg = false;
                }
            }
            if (flg) {
                //说明数组已经有序了
                break;
            }
        }
    }


    /**
     * 时间复杂度：
     * 最好情况：O(N*logN)  完全二叉树或者满二叉树
     * 最坏情况：O(N^2)  单分支的树
     * 空间复杂度：
     * 最好情况：O(logN)
     * 最坏情况：O(N)
     * 稳定性：不稳定
     *
     * @param arr
     */
    public static void quickSort(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }

    private static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            //说明左边只剩一个节点或者根本没有节点了
            return;
        }

        //减少了递归的次数
        if (end - start + 1 < 7) {
            //插入排序
            insertSortRange(arr, start, end);
            return;
        }

        //三数取中(降低树的高度)
        //说明index下标的值一定是中间大的值
        int index = midOfThree(arr, start, end);

        //和start交换，保证start下标一定是中间大的值
        int tmp = arr[index];
        arr[index] = arr[start];
        arr[start] = tmp;


        //找到基准
        int pivot = partition2(arr, start, end);

        //递归基准左边
        quick(arr, start, pivot - 1);
        //递归基准右边
        quick(arr, pivot + 1, end);
    }

    public static void insertSortRange(int[] arr, int begin, int end) {
        for (int i = begin + 1; i <= end; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= begin; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    public static int midOfThree(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        int max = (arr[left] > arr[right] ? arr[left] : arr[right]);
        max = (max > arr[mid] ? max : arr[mid]);
        int min = (arr[left] < arr[right] ? arr[left] : arr[right]);
        min = (min < arr[mid] ? min : arr[mid]);
        if (arr[left] > min && arr[left] < max) {
            return left;
        } else if (arr[mid] > min && arr[min] < max) {
            return mid;
        } else {
            return right;
        }
    }

    //找基准
    private static int partition(int[] arr, int left, int right) {
        int key = arr[left];
        int index = left;
        while (left < right) {

            //right 往左 走找比 key 小 的数
            while (left < right && arr[right] >= key) {
                right--;
            }
            //left 往右 走找比 key 大 的数
            while (left < right && arr[left] <= key) {
                left++;
            }
            //交换
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        int tmp = arr[index];
        arr[index] = arr[left];
        arr[left] = tmp;

        return left;
    }

    //找基准
    private static int partition2(int[] arr, int left, int right) {
        int tmp = arr[left];//所以此时left小标相当于是坑
        while (left < right) {
            //right往左找比tmp小的数
            while (left < right && arr[right] >= tmp) {
                right--;
            }
            //此时，arr[right] < tmp
            //填坑
            arr[left] = arr[right];
            //此时，新的坑就是right下标
            //left往右找比tmp大的数
            while (left < right && arr[left] <= tmp) {
                left++;
            }
            //此时，arr[left] > tmp
            //填坑
            arr[right] = arr[left];
            //此时，新的坑就是left
        }
        //此时，left和right相遇，
        //最后填坑
        arr[left] = tmp;
        return left;
    }

    private static int partition3(int[] array, int left, int right) {
        int prev = left;
        int cur = left + 1;
        while (cur <= right) {
            if (array[cur] < array[left] && array[++prev] != array[cur]) {
                swap(array, cur, prev);
            }
            cur++;
        }
        swap(array, prev, left);
        return prev;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void quickSortNor(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(left);
        stack.push(right);
        while (!stack.isEmpty()) {

            int pivot = partition2(arr, left, right);
            if (left < pivot - 1) {
                //说明pivot左边至少有2个元素
                //将基准左边起始位置和结束位置存入栈中
                stack.push(left);
                stack.push(pivot - 1);
            }
            if (pivot + 1 < right) {
                //说明pivot右边至少有2个元素
                //将基准右边起始位置和结束位置存入栈中
                stack.push(pivot + 1);
                stack.push(right);
            }
            right = stack.pop();
            left = stack.pop();
        }
    }


    /**
     * 时间复杂度：O(N*logN)
     * 缺点：空间复杂度很大 O(N)
     * 稳定性：稳定
     *
     * @param arr
     */
    public static void mergeSort(int[] arr) {
        mergeSortFunc(arr, 0, arr.length - 1);
    }

    //递归分解
    private static void mergeSortFunc(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        //递归分解左边
        mergeSortFunc(arr, left, mid);
        //递归分解右边
        mergeSortFunc(arr, mid + 1, right);
        //合并
        merge(arr, left, right, mid);
    }

    //合并有序数组
    private static void merge(int[] arr, int left, int right, int mid) {
        int[] tmpArr = new int[right - left + 1];
        int k = 0;
        int s1 = left;
        int s2 = mid + 1;
        while (s1 <= mid && s2 <= right) {
            if (arr[s1] <= arr[s2]) {
                tmpArr[k++] = arr[s1++];
            } else {
                tmpArr[k++] = arr[s2++];
            }
        }
        while (s1 <= mid) {
            tmpArr[k++] = arr[s1++];
        }
        while (s2 <= mid) {
            tmpArr[k++] = arr[s2++];
        }

        for (int i = 0; i < tmpArr.length; i++) {
            arr[i + left] = tmpArr[i];
        }
    }

    public static void mergeSortNor(int[] arr) {
        int gap = 1;//分组
        while (gap < arr.length) {
            //两组两组来合并
            for (int i = 0; i < arr.length; i += 2 * gap) {
                //第一组的开始和结束
                int left = i;
                int mid = left + gap - 1;
                //第二组的结束
                int right = mid + gap;
                //假如mid和right越界了，则需要修正
                if (mid >= arr.length) {
                    mid = arr.length - 1;
                }
                if (right >= arr.length) {
                    right = arr.length - 1;
                }
                //合并
                merge(arr, left, right, mid);
            }
            gap *= 2;
        }
    }


    /**
     * 时间复杂度：O(N + 范围)
     * 空间复杂度：O(范围)
     * 稳定性：稳定
     *
     * @param arr
     */
    public static void countSort(int[] arr) {
        int minVal = arr[0];
        int maxVal = arr[0];
        //1.求当前数组最大值和最小值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        //根据最大值和最小值差值确定数组大小
        int[] count = new int[maxVal - minVal + 1];
        //2.遍历数组，对应值count++
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - minVal]++;
        }
        int j = 0;//遍历arr
        //3.将count[i]对应次数值写回到arr
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                arr[j++] = i + minVal;
                count[i]--;
            }
        }
    }
}


//class Solution {
//
//    // 插入排序
//    public static void insertSort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int tmp = array[i];
//            int j = i - 1;
//            for (; j >= 0; j--) {
//                if (array[j] > tmp) {
//                    array[j + 1] = array[j];
//                } else {
//                    break;
//                }
//            }
//            array[j + 1] = tmp;
//        }
//    }
//
//
//    // 希尔排序
//    public static void shellSort(int[] array) {
//        int gap = array.length;
//        while (gap > 1) {
//            gap /= 2;
//            shell(array, gap);
//        }
//    }
//
//    private static void shell(int[] arr, int gap) {
//        for (int i = gap; i < arr.length; i++) {
//            int tmp = arr[i];
//            int j = i - gap;
//            for (; j >= 0; j -= gap) {
//                if (arr[j] > tmp) {
//                    arr[j + gap] = arr[j];
//                } else {
//                    break;
//                }
//            }
//            arr[j + gap] = tmp;
//        }
//    }
//
//    // 选择排序
//    public static void selectSort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] < array[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int tmp = array[minIndex];
//            array[minIndex] = array[i];
//            array[i] = tmp;
//        }
//    }
//
//
//    // 堆排序
//    public static void heapSort(int[] array) {
//        createBigHeap(array);
//        int end = array.length - 1;
//        while (end > 0) {
//            int tmp = array[0];
//            array[0] = array[end];
//            array[end] = tmp;
//            shiftDown(array, 0, end);
//            end--;
//        }
//
//    }
//
//    private static void createBigHeap(int[] arr) {
//        //找到最后一棵子树
//        for (int parent = (arr.length - 1 - 1) / 2; parent >= 0; parent++) {
//            shiftDown(arr, parent, arr.length);
//        }
//    }
//
//    private static void shiftDown(int[] arr, int parent, int len) {
//        int child = 2 * parent + 1;
//        while (child < len) {
//            if (child + 1 < len && arr[child + 1] > arr[child]) {
//                child++;
//            }
//            if (arr[parent] < arr[child]) {
//                int tmp = arr[parent];
//                arr[parent] = arr[child];
//                arr[child] = tmp;
//                parent = child;
//                child = 2 * parent + 1;
//            } else {
//                break;
//            }
//        }
//    }
//
//
//    // 冒泡排序
//    public static void bubbleSort(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            boolean flg = true;
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                    flg = false;
//                }
//            }
//            if (flg) {
//                break;
//            }
//        }
//    }
//
//    // 快速
//    public static void quickSort(int[] array) {
//        quick(array, 0, array.length - 1);
//    }
//
//    private static void quick(int[] arr, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//        int pivot = partition(arr, start, end);
//        quick(arr, start, pivot - 1);
//        quick(arr, pivot + 1, end);
//    }
//
//    private static int partition(int[] arr, int left, int right) {
//        int index = left;
//        int key = arr[left];
//        while (left < right) {
//            while (left < right && arr[right] >= key) {
//                right--;
//            }
//            while (left < right && arr[left] <= key) {
//                left++;
//            }
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//        }
//        int tmp = arr[index];
//        arr[index] = arr[left];
//        arr[left] = tmp;
//        return left;
//    }
//}
