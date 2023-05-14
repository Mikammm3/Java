public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Alg<T extends Comparable<T>> {
    //public Object[] arr = new Object[10];

    public T getMax(T[] arr) {
        T max = arr[0];
        int tmp = arr.length;
        for (int i = 1; i < tmp; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

}