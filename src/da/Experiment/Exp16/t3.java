package da.Experiment.Exp16;

/**
 * 编写一个应用程序创建两个线程，
 * 一个线程打印输出1～1000之间所有的偶数，
 * 另外一个线程打印输出2～1000之间所有的素数，
 * 要求两个线程随机休眠一段时间后继续打印输出下一个数。
 */
public class t3 {
    public static void main(String args[]) {
        Thread t1 = new Thread(new thread1());
        Thread t2 = new Thread(new thread2());
        t1.start();
        t2.start();
    }
}

class thread1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("thread1 计算出偶数：" + i);
            }

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

class thread2 implements Runnable {
    public void run() {
        for (int i = 2; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("thread2 计算出偶数：" + i);
            }

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
