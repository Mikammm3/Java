import java.util.PriorityQueue;

class MyTimerTask implements Comparable<MyTimerTask> {
    private Runnable runnable;
    private long time;

    public MyTimerTask(Runnable runnable, long delay) {
        this.runnable = runnable;
        this.time = delay + System.currentTimeMillis();
    }

    @Override
    public int compareTo(MyTimerTask o) {
        return (int) (this.time - o.time);
    }

    public long getTime() {
        return this.time;
    }

    public Runnable getRunnable() {
        return this.runnable;
    }
}


public class MyTimer {

    private PriorityQueue<MyTimerTask> queue = new PriorityQueue<>();

    private Object locker = new Object();

    public void schedule(Runnable runnable, long delay) {
        synchronized (locker) {
            queue.offer(new MyTimerTask(runnable, delay));
            locker.notify();
        }
    }

    public MyTimer() {
        Thread t = new Thread(() -> {
            while (true) {
                synchronized (locker) {
                    while (queue.isEmpty()) {
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    MyTimerTask task = queue.peek();
                    long curTime = System.currentTimeMillis();
                    if (task.getTime() >= curTime) {
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

class Demo {
    public static void main(String[] args) {
        MyTimer timer = new MyTimer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("3000");
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
        System.out.println("start");
    }
}



