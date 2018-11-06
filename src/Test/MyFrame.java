package Test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 封装共同方法作为父类
 */

public class MyFrame extends Frame {


    public void launchFrame() {//加载窗口：位置（左上角点为准）、宽度、高度
        setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        setLocation(100, 100);
        setVisible(true);

        new PaintThread().start();//启动重画线程


        /*
         * 窗口监听
         */
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);//关闭窗口
            }
        });
    }

    class PaintThread extends Thread {//线程类

        public void run() {
            while (true) {
                repaint();//重画窗口
                try {
                    Thread.sleep(70);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//画一个窗口休息40ms,否则太耗CPU
            }
        }
    }

}
