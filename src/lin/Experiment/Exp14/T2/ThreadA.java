package lin.Experiment.Exp14.T2;

import java.util.Random;

public class ThreadA implements Runnable {
    private boolean runFlag = true;
    private int number;

    @Override
    public void run() {
        while (runFlag) {
            synchronized (Main.msg) {
                if (Main.msg.action.equals("")) {
                    // 生成随机数啦
                    System.out.println("A：我生成了一个数。");
                    number = new Random().nextInt(99) + 1;
                    Main.msg = new Msg("start");
                    continue;
                }
                if ("guest".equals(Main.msg.action)) {
                    if (Main.msg.value == number) {
                        System.out.println("A：猜对啦！");
                        Main.msg = new Msg("right");
                        this.stop();
                    } else {
                        System.out.println("A：猜错啦！");
                        Main.msg = new Msg("wrong");
                    }
                }
            }
        }
    }

    public void stop() {
        this.runFlag = false;
    }
}
