package lin.Experiment.Exp6.T1;

/**
 * 圆锥
 */
public class Cone implements Shape {
    private double radius;
    /**
     * 母线长度
     */
    private double generatrix;


    public Cone(double radius, double generatrix) {
        this.radius = radius;
        this.generatrix = generatrix;
    }

    @Override
    public double volume() {
        return 2 * 3.14 * radius * generatrix;
    }

    @Override
    public double area() {
        return 3.14 * radius * generatrix + 3.14 * radius * radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getGeneratrix() {
        return generatrix;
    }

    public void setGeneratrix(double generatrix) {
        this.generatrix = generatrix;
    }
}
