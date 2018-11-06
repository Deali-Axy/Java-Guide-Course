package lin.Experiment.Exp6.T1;

/**
 * 圆柱体
 */
public class Cylinder implements Shape {
    private double height = 0;
    private double radius = 0;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 3.14 * radius * radius * height;
    }

    @Override
    public double area() {
        return 2 * radius * 3.14 * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
