public abstract class BankAccount {
    private double balance;
    private String holder;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void getBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double value) {
        if (value > 0) {
            if (balance >= value) {
                balance -= value;
                System.out.println("Withdrawal of " + value + " successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    public abstract void earnings(double taxes);
}
