package lin.Experiment.Exp14.T2;

/**
 * 有两个线程玩猜数游戏。A线程先随机给出一个1-100的随机整数，B线程负责来猜这个数。
 * 要求当B线程把自己猜测的数给A后，A线程给出提示有：猜错了或猜对了。
 * 猜数前，要求B线程要等待A线程设置好数后才开始猜。
 * B线程猜数原则是随机产生1-100间的整数，当A线程返回猜错时，B再生成1-100间的没有被猜测过的随机整数，如此进行，直接B线程给出正确的猜测后，游戏结束。
 */
public class Main {
    public static Msg msg = new Msg();

    public static void main(String... args) {
        new Thread(new ThreadA(), "A").start();
        new Thread(new ThreadB(), "B").start();
    }
}
