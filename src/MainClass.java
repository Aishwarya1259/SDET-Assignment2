
public class MainClass {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(0.5, 2000);

        System.out.println("Savings Account:");
        savingsAccount.addInterestToAccount(10000);

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(0.02, -2000);

        System.out.println("Current Account:");
        currentAccount.addInterestToAccount(-1000);
    }
}