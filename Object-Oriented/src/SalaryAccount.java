public class SalaryAccount extends BankAccount{

    public SalaryAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You append "+amount+" in your Salary Account, now your balance is "+balance);
    }

    @Override
    public void withdraw(double value) {
        balance = balance - value;
        System.out.println("You withdraw " +value+ " from you balance, now your balance is " +balance);
    }

    @Override
    public void earnings(double taxes) {

    }

}
