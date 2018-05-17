package da.Experiment.Exp10.t5;

public class Manager extends Employee {
    @Override
    public int getSalary() {
        return super.getSalary();
    }

    public double getSalary(double bonus) {
        return super.getSalary() + bonus;
    }
}
