
class MyArray<T> {
    public Object[] arr = new Object[10];

    public void set(int pos, T val) {
        arr[pos] = val;
    }

    public T get(int pos) {
        return (T) arr[pos];
    }
}

public class Test2 {

    public static void main1(String[] args) {

        //MyArray<Integer> list = new MyArray<>(); // 可以推导出实例化需要的类型实参为 Integer
        MyArray<String> myArray = new MyArray<>();
        myArray.set(0, "hehe");

        String str = myArray.get(0);
        System.out.println(str);
        //myArray.set(1, 90);//err

        MyArray<String> myArray2 = new MyArray<>();
    }
}
