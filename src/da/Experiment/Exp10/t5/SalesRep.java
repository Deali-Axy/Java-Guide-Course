package da.Experiment.Exp10.t5;

public class SalesRep extends Employee {
    @Override
    public int getSalary() {
        return super.getSalary();
    }

    public double getSalary(double sales) {
        double royalties;
        if (sales < 10000) {
            royalties = sales * 0.1;
        } else if (sales < 20000) {
            royalties = (20000 - sales) * 0.075 + 10000 * 0.1;
        } else if (sales < 40000) {
            royalties = (40000 - sales) * 0.05 + (20000 - sales) * 0.075 + 10000 * 0.1;
        } else if (sales < 60000) {
            royalties = (60000 - sales) * 0.03 + (40000 - 20000) * 0.05 + (20000 - sales) * 0.075 + 10000 * 0.1;
        } else {
            royalties = (sales - 60000) * 0.01 + (60000 - sales) * 0.03 + (40000 - 20000) * 0.05 + (20000 - sales) * 0.075 + 10000 * 0.1;
        }
        return super.getSalary() + royalties;
    }
}