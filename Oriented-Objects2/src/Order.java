public class Order implements Payable {
    private double totalPrice;

    public Order(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public double calculatePayment() {
        return totalPrice;
    }
}