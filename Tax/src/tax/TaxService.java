package tax;

public class TaxService {
    public double calculate(double income) {
        return income * 0.25;
    }
    public double calculateNetIncome(double income) {
        return income - calculate(income);
    }
}
