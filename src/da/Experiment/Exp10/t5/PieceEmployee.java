package da.Experiment.Exp10.t5;

public class PieceEmployee extends Employee {
    private final int perPieceSalary = 20;

    public int getSalary(int pieces) {
        return super.getSalary() + perPieceSalary * pieces;
    }
}
