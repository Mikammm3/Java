


//LeetCode 912. 排序数组
//import java.util.Stack;
//
//class Solution {
//    public int[] sortArray(int[] nums) {
//        //insertSort(nums);超时
//        //shellSort(nums);28ms
//        //selectSort(nums);超时
//        //heapSort(nums);32ms
//        //bubbleSort(nums);超时
//        //quickSort(nums);1799ms
//        //quickSortNor(nums);超时
//        //mergeSort(nums);28ms
//        mergeSortNor(nums);//28ms
//        return nums;
//
//    }
//
//    public void insertSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            for (; j >= 0; j--) {
//                if (arr[j] > key) {
//                    arr[j + 1] = arr[j];
//                } else {
//                    break;
//                }
//            }
//            arr[j + 1] = key;
//        }
//    }
//
//    public void shellSort(int[] arr) {
//        int gap = arr.length;
//        while (gap > 1) {
//            gap /= 2;
//            shell(arr, gap);
//        }
//    }
//
//    private void shell(int[] arr, int gap) {
//        for (int i = gap; i < arr.length; i++) {
//            int j = i - gap;
//            int key = arr[i];
//            for (; j >= 0; j -= gap) {
//                if (arr[j] > key) {
//                    arr[j + gap] = arr[j];
//                } else {
//                    break;
//                }
//            }
//            arr[j + gap] = key;
//        }
//    }
//
//    public void selectSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int tmp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = tmp;
//        }
//    }
//
//    public void heapSort(int[] arr) {
//        //创建大根堆
//        createBigHeap(arr);
//        int end = arr.length - 1;
//        while (end > 0) {
//            int tmp = arr[0];
//            arr[0] = arr[end];
//            arr[end] = tmp;
//            shiftDown(arr, 0, end);
//            end--;
//        }
//    }
//
//    private void createBigHeap(int[] arr) {
//        //找最后一棵子树
//        for (int parent = (arr.length - 1 - 1) / 2; parent >= 0; parent--) {
//            shiftDown(arr, parent, arr.length);
//        }
//    }
//
//    private void shiftDown(int[] arr, int parent, int len) {
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
//    public void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flg = true;
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                    flg = false;
//                }
//            }
//            if (flg) {
//                break;
//            }
//        }
//    }
//
//    public void quickSort(int[] arr) {
//        quick(arr, 0, arr.length - 1);
//    }
//
//    public void quickSortNor(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        Stack<Integer> stack = new Stack<>();
//        stack.push(left);
//        stack.push(right);
//        while (!stack.isEmpty()) {
//            right = stack.pop();
//            left = stack.pop();
//            int pivot = partition2(arr, left, right);
//            if (left < pivot - 1) {
//                stack.push(left);
//                stack.push(pivot - 1);
//            }
//            if (pivot + 1 < right) {
//                stack.push(pivot + 1);
//                stack.push(right);
//            }
//        }
//    }
//
//    private void quick(int[] arr, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        //三数取中
//        int mid = midOfThree(arr, left, right);
//        int tmp = arr[left];
//        arr[left] = arr[mid];
//        arr[mid] = tmp;
//
//        int pivot = partition(arr, left, right);
//        quick(arr, left, pivot - 1);
//        quick(arr, pivot + 1, right);
//    }
//
//    private int midOfThree(int[] arr, int left, int right) {
//        int mid = (left + right) / 2;
//        int max = ((arr[left] > arr[right]) ? arr[left] : arr[right]);
//        max = (arr[mid] > max ? arr[mid] : max);
//        int min = ((arr[left] < arr[right]) ? arr[left] : arr[right]);
//        min = (arr[mid] < min ? arr[mid] : min);
//        if (arr[left] > min && arr[left] < max) {
//            return left;
//        } else if (arr[mid] > min && arr[mid] < max) {
//            return mid;
//        } else {
//            return right;
//        }
//    }
//
//    //Hoare
//    private int partition(int[] arr, int left, int right) {
//        int key = arr[left];
//        int index = left;
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
//
//    //挖坑
//    private int partition2(int[] arr, int left, int right) {
//        int key = arr[left];
//        while (left < right) {
//            while (left < right && arr[right] >= key) {
//                right--;
//            }
//            arr[left] = arr[right];
//            while (left < right && arr[left] <= key) {
//                left++;
//            }
//            arr[right] = arr[left];
//        }
//        arr[left] = key;
//        return left;
//    }
//
//    public void mergeSort(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        mergeSortFunc(arr, left, right);
//    }
//
//    private void mergeSortFunc(int[] arr, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//        int mid = (left + right) / 2;
//        //分解递归左边
//        mergeSortFunc(arr, left, mid);
//        //分解递归右边
//        mergeSortFunc(arr, mid + 1, right);
//
//        //合并
//        merge(arr, left, right, mid);
//    }
//
//    private void merge(int[] arr, int left, int right, int mid) {
//        int s1 = left;
//        int s2 = mid + 1;
//        int[] tmpArr = new int[right - left + 1];
//        int k = 0;
//        while (s1 <= mid && s2 <= right) {
//            if (arr[s1] <= arr[s2]) {
//                tmpArr[k++] = arr[s1++];
//            } else {
//                tmpArr[k++] = arr[s2++];
//            }
//        }
//        while (s1 <= mid) {
//            tmpArr[k++] = arr[s1++];
//        }
//        while (s2 <= right) {
//            tmpArr[k++] = arr[s2++];
//        }
//        for (int i = 0; i < tmpArr.length; i++) {
//            arr[i + left] = tmpArr[i];
//        }
//    }
//
//    public void mergeSortNor(int[] arr) {
//        int gap = 1;
//        while (gap < arr.length) {
//            for (int i = 0; i < arr.length; i += 2 * gap) {
//                int left = i;
//                int mid = i + gap - 1;
//                int right = i + 2 * gap - 1;
//                if (mid >= arr.length) {
//
//                    mid = arr.length - 1;
//                }
//                if (right >= arr.length) {
//                    right = arr.length - 1;
//                }
//                merge(arr, left, right, mid);
//            }
//            gap *= 2;
//        }
//    }
//}