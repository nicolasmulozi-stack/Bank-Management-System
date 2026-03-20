public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void addInterest() {
        double interest = getBalance() * 0.05;
        deposit(interest);
    }
}