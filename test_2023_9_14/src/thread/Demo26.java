package thread;

// 模拟实现一个简单的定时器

import java.util.PriorityQueue;

// 这个类用来描述任务的信息，包括时间和任务内容
class MyTimerTask implements Comparable<MyTimerTask> {
    // 要有一个要执行的任务
    private Runnable runnable;
    // 还要有一个执行任务的时间
    private long time;

    // 此处的 delay 就是 schedule 传入的“相对时间”
    public MyTimerTask(Runnable runnable, long delay) {
        this.runnable = runnable;
        this.time = delay + System.currentTimeMillis();// 绝对时间
    }


    @Override
    public int compareTo(MyTimerTask o) {
        // 这样的写法，就是让队首元素是最小时间的值
        return (int) (this.time - o.time);
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public long getTime() {
        return time;
    }
}

// 定时器，需要一个存放任务的数据结构，以及一个扫描线程
class MyTimer {
    // 使用一个数据结构，保存所有要安排的任务
    private PriorityQueue<MyTimerTask> queue = new PriorityQueue<>();

    // 使用这个对象作为锁对象
    private Object locker = new Object();

    // 添加任务
    public void schedule(Runnable runnable, long delay) {
        synchronized (locker) {
            queue.offer(new MyTimerTask(runnable, delay));
            locker.notify();
        }
    }

    // 构造方法 里面需要带有扫描线程
    public MyTimer() {
        // 创建一个扫描线程
        Thread t = new Thread(() -> {
            synchronized (locker) {
                // 扫描线程，需要不停的扫描队首元素，看是否是到达时间
                while (true) {
                    // 使用 while 的目的是为了在 wait 被唤醒的时候，再次确认一下条件
                    while (queue.isEmpty()) {
                        // 如果队列为空，那就阻塞等待,直到队列里面有元素为止
                        try {
                            // 这里的 wait，需要由别的线程唤醒
                            // 添加了新的任务，就需要唤醒
                            locker.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    MyTimerTask task = queue.peek();
                    // 比较一下当前的队首元素是否可以执行了
                    long curTime = System.currentTimeMillis();
                    if (curTime >= task.getTime()) {
                        task.getRunnable().run();
                        queue.poll();
                    } else {
                        try {
                            locker.wait(task.getTime() - curTime);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });
        t.start();
    }
}


public class Demo26 {
    public static void main(String[] args) {
        MyTimer timer = new MyTimer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(3000);
            }
        }, 3000);
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("2000");
            }
        }, 2000);
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("1000");
            }
        }, 1000);
        System.out.println("程序启动！");
    }
}
