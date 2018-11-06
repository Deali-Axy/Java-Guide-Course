package lin.Experiment.Exp6.T1;

/**
 * 立方体
 */
public class Cuboid implements Shape {
    private double heigh = 0;
    private double width = 0;
    private double length = 0;


    public Cuboid(double heigh, double width, double length) {
        this.heigh = heigh;
        this.width = width;
        this.length = length;
    }

    @Override
    public double volume() {
        return heigh * width * length;
    }

    @Override
    public double area() {
        return heigh * width * 2 + width * length * 2 + heigh * length * 2;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
