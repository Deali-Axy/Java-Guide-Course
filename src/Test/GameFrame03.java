package Test;

import java.awt.Graphics;
import java.awt.Image;

public class GameFrame03 extends MyFrame {
    Image img = GameUtil.getImage("images/wa.jpg");//加载图片

    private double x = 100, y = 100;
    private double degree = 0;
    private double speed = 10;

    public void paint(Graphics g) {//具体画图
        g.drawImage(img, (int) x, (int) y, null);
        if (speed > 0) {
            speed -= 0.05;
        }
        if (degree >= 0) {
            degree += 3;
            x += speed * Math.cos(degree);
            y += speed * Math.sin(degree);
        }

        if (x > 500 - 140 || x < 8) {
            degree = 3.14 - degree;
        }

        if (y > 500 - 140 || y < 40) {
            degree = -degree;

        }

    }


}
