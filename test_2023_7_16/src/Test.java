import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 9, 7, 9, 6, 4, 5, 7, 7, 3, 3, 6};
        Sort.countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
