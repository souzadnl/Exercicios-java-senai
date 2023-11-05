public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Daniel", 5000, 1000);
        Programmer programmer = new Programmer("Temóteo", 6000, 1000);

        manager.displayDetails();
        programmer.displayDetails();

        System.out.println("//////////////////////////////////////////////////////////////////");
        
        FreightCalculator calculator = new FreightCalculator();

        double totalFreight = calculator.calculateFreight(100, 20.0, "fragile");

        System.out.println("Full shipping: R$" + totalFreight);

        ///////////////////////////////////////////////////////////////////
        Book book1 = new Book("Senai Roberto Mange");
        Book book2 = new Book("Java Manual");

        book1.borrow();
        book2.borrow();
        book1.borrow();
        book1.returnBook();
        book1.borrow();
    }
}