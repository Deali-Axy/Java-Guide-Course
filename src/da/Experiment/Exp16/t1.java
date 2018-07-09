package da.Experiment.Exp16;

/**
 * 1．输入下面的多线程程序，运行该程序，观察程序的运行结果。
 * 1：class SimpleThread extends Thread {
 * 2： 	public SimpleThread(String str) {
 * 3： 		super(str); //调用其父类的构造方法
 * 4： 	}
 * 5： 	public void run() { //重写run方法
 * 6： 		for (int i = 0; i < 10; i++) {
 * 7： 			System.out.println(i + " " + getName());
 * 8： 		//打印次数和线程的名字
 * 9： 		try {
 * 10： 		sleep((int)(Math.random() * 1000));
 * 11： 		//线程睡眠，把控制权交出去
 * 12： 	}
 * 13： 	catch (InterruptedException e) { }
 * 14：}
 * 15：System.out.println("DONE! " + getName());
 * 16：//线程执行结束
 * 17：}
 * 18：}
 * 1：public class TwoThreadsTest {
 * 2： 	public static void main (String args[]) {
 * 3： 		new SimpleThread("First").start();
 * 4： 		//第一个线程的名字为First
 * 5： 		new SimpleThread("Second").start();
 * 6： 		//第二个线程的名字为Second
 * 7： 	}
 * 8：}
 */
public class t1 extends Thread {
    public t1(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
        }
        try {
            sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println("Done! " + getName());
    }

    public static void main(String args[]) {
        new t1("first").start();
        new t1("second").start();
    }
}
