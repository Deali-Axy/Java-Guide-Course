package lin.Experiment.Exp6.T2;

public class Posisition extends CompareObject {
    private int x;
    private int y;

    public Posisition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    int compareTo(Object obj) {
        int x1 = ((Posisition) obj).getX();
        int y1 = ((Posisition) obj).getY();
        double distance = Math.sqrt(x1 * x1 - x * x) + Math.sqrt(y1 * y1 - y * y);
        return (int) distance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
