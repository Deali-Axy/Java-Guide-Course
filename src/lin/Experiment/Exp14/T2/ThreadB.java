package lin.Experiment.Exp14.T2;

import java.util.Random;

public class ThreadB implements Runnable {
    private boolean runFlag = true;

    @Override
    public void run() {
        while (runFlag) {
            synchronized (Main.msg) {
                // 如果A还没生成一个数则继续等
                if (Main.msg == null)
                    continue;
                switch (Main.msg.action) {
                    case "start":
                        int number = new Random().nextInt(99) + 1;
                        System.out.printf("B：我猜是%d，对不对？\n", number);
                        Main.msg = new Msg("guest", number);
                        break;
                    case "wrong":
                        number = new Random().nextInt(99) + 1;
                        System.out.printf("B：又不对？我猜是%d，是不是？\n", number);
                        Main.msg = new Msg("guest", number);
                        break;
                    case "right":
                        this.stop();
                }
            }
        }
    }

    public void stop() {
        this.runFlag = false;
    }
}
