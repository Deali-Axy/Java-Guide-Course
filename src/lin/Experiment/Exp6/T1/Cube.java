package lin.Experiment.Exp6.T1;

public class Cube implements Shape {
    private double length = 0;

    public Cube(double length){
        this.length=length;
    }

    @Override
    public double volume() {
        return length * length * length;
    }

    @Override
    public double area() {
        return length * length * 6;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
