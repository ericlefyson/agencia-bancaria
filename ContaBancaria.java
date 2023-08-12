public class ContaBancaria {
    private int accountNumber;
    private String userName;
    private double balance;

    public ContaBancaria(int accountNumber, String userName, double balance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public double getBalance() {
        return this.balance;
    }
}