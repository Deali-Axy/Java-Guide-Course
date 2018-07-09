package da.Experiment.Exp16;

/**
 * 2．下面多线程程序用Runnable接口来实现。请调试运行。
 * class SimpleThread implements Runnable{
 * 	public void run(){
 * 		for (int i = 0; i < 10; i++){
 * 			System.out.println(i + " " + Thread.currentThread().getName());
 * 			try {
 * 				Thread.sleep((int)(Math.random() * 1000));
 * 	            //线程睡眠，把控制权交出去
 *                                }
 * 	            catch (InterruptedException e)           { }
 * 	      }
 * 	     System.out.println("DONE! " + Thread.currentThread().getName());
 * 	    //线程执行结束
 * 	}
 * }
 * public class Test {
 * 	public static void main (String args[]) {
 * 	    /*Thread t1=new Thread("First");
 * 	    //第一个线程的名字为First
 * 	    Thread t2=new Thread("Second");
 * 	    //第二个线程的名字为Second
 * 	    t1.start();
 * 	    t2.start();
 * 	    new Thread(new SimpleThread(),"First").start();
 *      new Thread(new SimpleThread(),"Second").start();
 *   }
 * }
 */
public class t2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep((int)(Math.random() * 1000));
            }
            catch (InterruptedException e) { }
        }
        System.out.println("DONE! " + Thread.currentThread().getName());
    }

    public static void main(String args[]){
        Thread t1=new Thread("first");
        Thread t2=new Thread("second");
        t1.start();
        t2.start();
        new Thread(new t2(),"first").start();
        new Thread(new t2(),"second").start();
    }
}
