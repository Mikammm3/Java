import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
    //例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//    public static void transform(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= 2;
//        }
//    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //如数组：[1,2,3,4,5,6]
    //调整后可能是：[1, 5, 3, 4, 2, 6]
//    public static void sort(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            while (left < right) {
//                if (arr[left] % 2 == 0) {
//                    break;
//                }
//                left++;
//            }
//            while (left < right) {
//                if (arr[right] % 2 != 0) {
//                    break;
//                }
//                right--;
//            }
//            int tmp = arr[left];
//            arr[left++] = arr[right];
//            arr[right--] = tmp;
//        }
//    }
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
//    public static double avg(int[] arr) {
//        double sum = 0.0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i] * 1.0;
//        }
//        return sum / arr.length;
//    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
//    public static void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
//    }

//    public static int[] find(int[] arr, int t) {
//        int[] index = {-1, -1};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == arr[i]) {
//                    continue;
//                }
//                if (arr[i] + arr[j] == t) {
//                    index[0] = i;
//                    index[1] = j;
//                    return index;
//                }
//            }
//        }
//        return index;
//    }

    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//    public static int singleDog(int[] arr) {
//        int ret = 0;
//        for (int x : arr) {
//            ret ^= x;
//        }
//        return ret;
//    }

    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//    public static int maxCnt(int[] arr) {
//        int[] cnt = new int[1000000];
//        for (int i = 0; i < arr.length; i++) {
//            int tmp = arr[i];
//            cnt[tmp]++;
//        }
//        int max = 0;
//        int num = -1;
//        for (int i = 0; i < 1000000; i++) {
//            if (cnt[i] > max) {
//                max = cnt[i];
//                num = i;
//            }
//        }
//        return num;
//    }

    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
    public static boolean lastingOdd(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(lastingOdd(arr));
        //System.out.println(maxCnt(arr));
        //System.out.println(singleDog(arr));
        //int[] i = find(arr, 9);
        //System.out.println(Arrays.toString(i));
        //bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        //sort(arr);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(avg(arr));
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
    }
//    public static void bubbleSort(int[] arr) {
//        //冒泡排序趟数
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = true;
//            //一趟冒泡排序
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                    flag = false;
//                }
//            }
//            if (flag == true) {
//                break;
//            }
//        }
//    }

//    public static void main(String[] args) {
////        int[] arr = new int[10];
////        //Arrays.fill()就是用val：-1 填充arr
////        Arrays.fill(arr, -1);
////        int[] arr = {1, 2, 3, 4, 5};
////        int[] arr2 = {1, 2, 3, 4, 5};
////        boolean flag = Arrays.equals(arr, arr2);
////        System.out.println(Arrays.binarySearch(arr, 5));
//    }


//    public static int binarySearch(int[] arr, int k) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (arr[mid] > k) {
//                right = mid - 1;
//            } else if (arr[mid] < k) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }


//    public static int findVal(int[] arr, int k) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == k) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        //[1,3)  能拷多少拷多少
//        int[] copy = Arrays.copyOfRange(arr, 1, 3);
//        System.out.println(Arrays.toString(copy));
//        //拷贝并扩容
//        int[] copy2 = Arrays.copyOf(arr, arr.length * 2);
//        System.out.println(Arrays.toString(copy2));
//    }
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        //拷贝方法1：通过for循环
//        int[] arr2 = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        System.out.println(Arrays.toString(arr2));
//    }

    //模拟实现toString
//    public static String myToString(int[] arr) {
//        String str = "[";
//        for (int i = 0; i < arr.length; i++) {
//            str += arr[i];
//            if (i != arr.length - 1) {
//                str += ",";
//            }
//        }
//        str += "]";
//        return str;
//    }

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(myToString(arr));
////        //可以通过循环打印数组，
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i] + " ");
////        }
////        //也可以通过Arrays.toString(数组名)
////        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        func(arr);
//        System.out.println("arr[0] = " + arr[0]);
//    }
//
//    public static void func(int[] a) {
//        a[0] = 10;
//        System.out.println("a[0] = " + a[0]);
//    }
//// 执行结果
//    a[0]=10
//    arr[0]=10
//    public static void main(String[] args) {
//        int num = 0;
//        func(num);
//        System.out.println("num = " + num);
//    }
//
//    public static void func(int x) {
//        x = 10;
//        System.out.println("x = " + x);
//    }
//// 执行结果
//    x =10
//    num =0

//    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        for (int i = 0; i < array.length; ++i) {
//            System.out.println(array[i] + " ");
//        }
//    }

//    public static void func1(int[] arr) {
//        arr = new int[10];
//    }
//
//    public static void func2(int[] arr) {
//        arr[0] = 99;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4};
//        func1(arr1);
//
//        int[] arr2 = {1, 2, 3, 4};
//        func2(arr2);
//        /*int[] arr = null;
//        System.out.println(arr.length);//err*/
//    }

    //    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};//方法1
//        int[] arr2 = new int[10];//方法2
//        int[] arr3 = new int[]{1, 2a, 3, 4};//方法3
//    }
//    public static String myToString(int[] array) {
//        String ret = "[";
//        for (int i = 0; i < array.length; i++) {
//            ret += array[i];
//            if (i < array.length - 1) {
//                ret += ",";
//            }
//        }
//        ret += "]";
//        return ret;
//    }
//
//    public static void main1(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        //将每个数组元素存在tmp中，快速访问arr
//        for (int tmp : arr) {
//            System.out.println(tmp);
//        }

    //类型  数组名 new 类型[]
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = new int[10];
//        int[] arr3 = new int[]{1, 2, 3, 4, 5};
}
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        String ret = myToString(array);
//        System.out.println(ret);
//    }
//}


//public class TestArray {
//    public static int[] fib(int n) {
//        if (n <= 0) {
//            return null;
//        }
//        int[] array = new int[n];
//        array[0] = array[1] = 1;
//        for (int i = 2; i < n; ++i) {
//            array[i] = array[i - 1] + array[i - 2];
//        }
//        return array;
//    }
//
//    public static void main(String[] args) {
//        int[] array = fib(10);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }
//}