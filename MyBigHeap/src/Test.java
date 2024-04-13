public class Test {
    public static void main(String[] args) {
        MyBigHeap heap = new MyBigHeap();
        int[] arr = {19, 37, 28, 54, 76, 88, 12, 49, 90, 65};
        heap.initHeap(arr);
        heap.createHeap();
        heap.offer(83);
        System.out.println();
        System.out.println(heap.poll());
    }
}
