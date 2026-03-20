public class BankApp {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.addInterest();

        System.out.println("Balance: " + acc.getBalance());
    }
}