package da.Experiment.Exp10.t5;

import qfx.io.QConsole;

public class SalaryTest {
    public static void main(String args[]) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        PieceEmployee pieceEmployee = new PieceEmployee();
        SalesRep salesRep = new SalesRep();
        Manager manager = new Manager();

        QConsole console = new QConsole(System.in, System.out);
        console.writeLine(hourlyEmployee.getSalary((int) (Math.random() * 100)));
        console.writeLine(pieceEmployee.getSalary((int) (Math.random() * 100)));
        console.writeLine(salesRep.getSalary(Math.random() * 10000));
        console.writeLine(manager.getSalary(Math.random() * 20000));
    }
}
