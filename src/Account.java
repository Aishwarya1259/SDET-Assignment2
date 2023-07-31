
public class Account {
    protected double interest;

    public Account(double interest) {
        this.interest = interest;
    }

    public double calculateInterest(double balance) {
        return balance * interest;
    }

    public void addInterestToAccount(double balance) {
        double interestAmount = calculateInterest(balance);
        balance += interestAmount;
        System.out.println("Interest added: " + interestAmount);
        System.out.println("Updated account balance: " + balance);
    }
}

    





