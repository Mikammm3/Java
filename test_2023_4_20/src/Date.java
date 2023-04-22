public class Date {
    public int year;
    public int month;
    public int day;

    //    public void setDay(int y, int m, int d) {
//        year = y;
//        month = m;
//        day = d;
//    }
    public void setDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate() {
        System.out.println(year + "/" + month + "/" + day);
    }

    public static void main(String[] args) {
// 构造三个日期类型的对象 d1 d2 d3
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
// 对d1，d2，d3的日期设置
        d1.setDay(2020, 9, 15);
        d2.setDay(2020, 9, 16);
        d3.setDay(2020, 9, 17);
// 打印日期中的内容
        d1.printDate();
        d2.printDate();
        d3.printDate();
    }
}