public class Invoice implements Payable {
    private double amountDue;

    public Invoice(double amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }
}