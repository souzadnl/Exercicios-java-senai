public class CurrentAccount extends BankAccount{
    double limits;
    public CurrentAccount(double balance, double limits) {
        super(balance);
        this.limits = limits;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You append "+amount+" in your Current Account, now your balance is "+balance);
    }

    @Override
    public void withdraw(double value) {
        if((balance + limits) > value) {
            balance = balance - value;
            System.out.println("You withdraw " +value+ " from you balance, now your balance is " +balance);
        } else {
            System.out.println("Balance insufficient");
        }
    }

    @Override
    public void earnings(double taxes) {
        balance = balance + (balance * (taxes / 100));
        System.out.println("Your balance with taxes is " + balance);
    }
}
