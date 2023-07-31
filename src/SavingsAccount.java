
public class SavingsAccount extends Account {
    private double minimumBalance;

    public SavingsAccount(double interest, double minimumBalance) {
        super(interest);
        this.minimumBalance = minimumBalance;
    }

    // Overriding the calculateInterest method for SavingsAccount
    @Override
    public double calculateInterest(double balance) {
        if (balance >= minimumBalance) {
            return balance * interest;
        } else {
            return 0.0;
        }
    }
}