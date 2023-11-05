public abstract class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Your balance is: "+balance);
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double value);

    public abstract void earnings(double taxes);

}
