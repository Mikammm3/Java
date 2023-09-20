package thread;

import java.util.Timer;
import java.util.TimerTask;

// 定时器
public class Demo25 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        // 给定时器安排了一个任务，预定在 xxx 时间去执行。
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("3000");
            }
        }, 3000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("2000");
            }
        }, 2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("1000");
            }
        }, 1000);
        System.out.println("程序启动！");
    }
}
