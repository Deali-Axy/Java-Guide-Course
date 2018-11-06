package da.Experiment.Exp10.t5;

public class HourlyEmployee extends Employee {
    private final int perHourSalary = 50;

    public int getSalary(int hours) {
        return super.getSalary() + perHourSalary * hours;
    }
}