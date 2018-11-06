package Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 测试窗口物体沿着各种轨迹移动，实现台球小游戏
 */
public class GameFrame02 extends Frame{
Image img=GameUtil.getImage("images/wa.jpg");//加载图片
	
	/*
	 * 窗口加载
	 */
	public void launchFrame() {//加载窗口：位置（左上角点为准）、宽度、高度
		setSize(500,500);
		setLocation(100,100);
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
	private double x=100,y=100;
	private double degree=3.14/3 ;//[0,2pi]
	private double speed=10;
   /* private boolean left;
	@Override*/
	public void paint(Graphics g) {
	    g.drawImage(img, (int)x, (int)y, null);//图片对象 图片位置  转换了更多图像时要通知的对象
	    if(speed>0) {
	        speed-=0.05;
	    }
	    x+=speed*Math.cos(degree);
	    y+=speed*Math.sin(degree);
	    if(x>500-140) {
	    	degree=3.14-degree;
	    }
	    if(x<8) {
	    	degree=3.14-degree;
	    }
	    if(y>500-140) {
	    	degree=-degree;
	    	
	    }
	    if(y<40) {
	    	degree=-degree;
	    	
	    }
	    /*if(left) {//向左向右移动
	    	x-=10;
	    	
	    }else {
	    	x+=10;
	    }if(x>500-170) {
	    	left=true;
	    }if(x<0) {
	    	left=false;
	    }*/
	}
	
	
	/*
	 * 定义一个重画窗口的线程类，是一个内部类，方便访问外部类属性
	 */
	class PaintThread  extends Thread{//线程类
		public void run() {
			while(true) {
				repaint();//重画窗口
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//画一个窗口休息40ms,否则太耗CPU
			}
		}
	}

	
	public static void main(String[] args) {
		GameFrame02 gf = new GameFrame02();
		gf.launchFrame();
	}
	

}
