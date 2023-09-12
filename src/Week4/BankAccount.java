
package Week4;

public class BankAccount {
    private static int totalAccounts = 0;
    private double balance;
    private int deposits;
    private int withdrawals;
    public BankAccount() {
        totalAccounts++;
        int accountNumber = totalAccounts;
        this.balance = 0;
        this.deposits = 0;
        this.withdrawals = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.deposits++;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        this.withdrawals++;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit(1000000);
        account2.deposit(12314);

        account1.withdraw(9000);
        account2.withdraw(50);

        System.out.println("Account 1 balance: " + account1.balance);
        System.out.println("Account 2 balance: " + account2.balance);
        System.out.println("Total accounts: " + BankAccount.totalAccounts);
    }
}