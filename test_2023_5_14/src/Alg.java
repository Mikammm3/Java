import java.util.ArrayList;
import java.util.List;

public class Alg<T extends Comparable<T>> {
    public T getMax(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}


class Alg2 {
    public static <T extends Comparable<T>> T getMax(T[] arr) {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}

class Main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        //Alg2 alg2 = new Alg2();
        Integer[] arr = {1, 2, 3, 79, 8, 65, 4};
        Integer max = Alg2.<Integer>getMax(arr);
        System.out.println(max);
    }

}