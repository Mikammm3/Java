
// leetcode 380. O(1) 时间插入、删除和获取随机元素
//class RandomizedSet {
//
//    private Set<Integer> set;
//    private List<Integer> arr;
//    private Random random;
//
//    public RandomizedSet() {
//        set = new HashSet<>();
//        arr = new ArrayList<>();
//        random = new Random();
//    }
//
//    public boolean insert(int val) {
//        if (set.isEmpty()) {
//            set.add(val);
//            arr.add(val);
//            return true;
//        } else {
//            if (set.contains(val)) {
//                return false;
//            } else {
//                set.add(val);
//                arr.add(val);
//                return true;
//            }
//        }
//    }
//
//    public boolean remove(int val) {
//        if (set.isEmpty()) {
//            return false;
//        }
//        set.remove(val);
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) == val) {
//                set.remove(arr.get(i));
//                arr.remove(i);
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//    public int getRandom() {
//        if (arr.isEmpty()) {
//            return -1;
//        }
//        int i = random.nextInt(0, arr.size());
//        return arr.get(i);
//    }
//}
//class RandomizedSet {
//
//    // map 存储 val, 对应数组下标
//    private Map<Integer, Integer> map;
//    private List<Integer> arr;
//    private Random random;
//
//    public RandomizedSet() {
//        map = new HashMap<>();
//        arr = new ArrayList<>();
//        random = new Random();
//    }
//
//    public boolean insert(int val) {
//        if (map.containsKey(val)) {
//            return false;
//        } else {
//            map.put(val, arr.size());
//            arr.add(val);
//            return true;
//        }
//    }
//
//    public boolean remove(int val) {
//        if (!map.containsKey(val)) {
//            return false;
//        }
//        int index = map.get(val);
//        // 将最后一个元素覆盖掉 arr[index]
//        int last = arr.get(arr.size() - 1);
//        arr.set(index, last);
//        // 将最后一个元素的 map 更新
//        map.put(last, index);
//        // 删除
//        arr.remove(arr.size() - 1);
//        map.remove(val);
//        return true;
//    }
//
//    public int getRandom() {
//        if (arr.isEmpty()) {
//            return -1;
//        }
//        int i = random.nextInt(0, arr.size());
//        return arr.get(i);
//    }
//}