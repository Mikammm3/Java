

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
        //找到基准
        int pivot = partition(arr, start, end);

        //递归基准左边
        quick(arr, start, pivot - 1);
        //递归基准右边
        quick(arr, pivot + 1, end);
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
}
