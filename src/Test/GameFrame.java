package Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类 
 * @author HP
 *
 */
public class GameFrame extends Frame {    //GUI编程：AWT,swing等
	
	Image img=GameUtil.getImage("images/sun.jpg");//加载图片
	
	/*
	 * 窗口加载
	 */
	public void launchFrame() {//加载窗口：位置（左上角点为准）、宽度、高度
		setSize(500,400);
		setLocation(100,100);
		setVisible(true);
		/*
		 * 窗口监听
		 */
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);//关闭窗口
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 200, 200);//x1,y1;x2,y2
		g.drawRect(100, 100, 100, 100);//长方形原点、宽、高度
		g.drawOval(100, 100, 100, 100);//相当于画外切正方形
		
		Font f = new Font("宋体",Font.BOLD,50);//宋体粗体50大小
		g.setFont(f);
		g.drawString("三木阿", 150, 150);//字符串内容及位置
		
		g.fillRect(100, 100, 20, 20);//填充长方形
		
		Color c = g.getColor();//保存原来颜色
		g.setColor(Color.green);//color(255,0,0)=红，红绿蓝
		g.fillOval(200, 200, 20, 20);//蓝色的填充圆
	
	    g.setColor(c);//还原原来颜色
	    
	    g.drawImage(img, 200,200, null);//图片对象 图片位置  转换了更多图像时要通知的对象
	}

	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
		gf.launchFrame();
	}
	
     
}
