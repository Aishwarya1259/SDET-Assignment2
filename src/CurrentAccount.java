
public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double interest, double overdraftLimit) {
        super(interest);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the calculateInterest method for CurrentAccount
    @Override
    public double calculateInterest(double balance) {
        if (balance < 0) {
            return balance * interest;
        } else {
            return 0.0;
        }
    }
}








