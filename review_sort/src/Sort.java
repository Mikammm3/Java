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

    public static void shell(int[] arr) {
        int gap = arr.length / 2;
        while (gap > 1) {
            shellSort(arr, gap);
            gap /= 2;// 缩小增量
        }
        // gap 为 1 时还得再排序一遍
        shellSort(arr, gap);
    }


    public static void shellSort(int[] arr, int gap) {
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - gap;
            for (; j >= 0; j -= gap) {
                if (arr[j] > tmp) {
                    // 比 tmp 大就往后挪
                    arr[j + gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + gap] = tmp;
        }
    }


    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            // 遍历找最小
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换
            swap(arr, minIndex, i);
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }


    public static void selectSort2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            // 在一次遍历中，寻找最大值和最小值的下标
            for (int i = left + 1; i <= right; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            // 找完后就交换
            swap(arr, left, minIndex);
            // 特殊情况，如果 max 刚好是 left
            // 而刚刚又将 min 和 left 交换过了
            // 所以此时的 max 应该是 min，所以需要更正 max
            if (maxIndex == left) {
                maxIndex = minIndex;
            }
            swap(arr, right, maxIndex);
            left++;
            right--;
        }
    }


    public static void heapSort(int[] arr) {
        createBigHeap(arr);
        // 就跟删除差不多，删除头节点，把节点删的只剩下一个那就有序了
        int end = arr.length - 1;
        while (end != 0) {
            // 交换头节点和最后一个孩子节点
            swap(arr, 0, end);
            // 交换完后向下调整
            shiftDown(arr, 0, end);
            end--;
        }

    }

    private static void createBigHeap(int[] arr) {
        for (int parent = (arr.length - 1 - 1) / 2; parent >= 0; parent--) {
            shiftDown(arr, parent, arr.length);
        }
    }


    private static void shiftDown(int[] arr, int parent, int end) {
        // 先找到左右孩子的最大值,然后判断，交换，向下调整
        int child = 2 * parent + 1;
        while (child < end) {
            if (child + 1 < end && arr[child + 1] > arr[child]) {
                child++;
            }
            // 到这 child 一定是左右孩子的最大值
            if (arr[parent] >= arr[child]) {
                // 此时说明这棵树有序了
                break;
            } else {
                // 交换
                swap(arr, parent, child);
                // 向下
                parent = child;
                child = 2 * parent + 1;
            }
        }
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 优化
            boolean flg = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flg = true;
                    swap(arr, j, j + 1);
                }
            }
            if (!flg) {
                break;
            }
        }
    }


    public static void quickSort(int[] arr, int start, int end) {
        // 如果左边是一个节点或者左边没有节点，那就可以不用递归了
        if (start >= end) {
            return;
        }
        // 找基准
        int pivot = partition2(arr, start, end);
        // 递归基准左边
        quickSort(arr, start, pivot - 1);
        // 递归基准右边
        quickSort(arr, pivot + 1, end);
    }

    // Hoare 法
    private static int partition(int[] arr, int left, int right) {
        int key = arr[left];
        int index = left;
        while (left < right) {
            // right 往前找比 key 小的
            while (left < right && arr[right] >= key) {
                right--;
            }
            // left 往后找比 key 大的
            while (left < right && arr[left] <= key) {
                left++;
            }
            // 到了这里，arr[right] 一定小于 key
            // arr[left] 一定大于 key
            // 交换 arr[left] 和 arr[right]
            swap(arr, left, right);
        }
        // 最后当 left 和 right 相遇时，交换
        swap(arr, index, left);
        return left;
    }

    // 挖坑法
    private static int partition2(int[] arr, int left, int right) {
        int tmp = arr[left];
        while (left < right) {
            // right 找比 tmp 小的数
            while (left < right && arr[right] >= tmp) {
                right--;
            }
            // 此时，right 找到了比 tmp 小的数，填坑
            arr[left] = arr[right];
            //此时，新的坑就是 right 下标
            // left 找比 tmp 大的数
            while (left < right && arr[left] <= tmp) {
                left++;
            }
            // 此时，left 找到了比 tmp 大的数，填坑
            arr[right] = arr[left];
        }
        // left 和 right 相遇，填坑
        arr[left] = tmp;
        return left;
    }
}
