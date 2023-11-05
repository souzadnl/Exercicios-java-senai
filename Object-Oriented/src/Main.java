import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        System.out.println("Choose the option you want:\n[1] Product\n[2] Price\n[3] Bank\n[5] Management");
        String choice = write.next();

        switch (choice) {
            case "1":
                System.out.println("Enter the name of product: ");
                String name = write.next();
                System.out.println("Enter the price of product: ");
                int price = write.nextInt();

                Product product = new Product(name, price);
                product.Discount();
                System.out.println("The "+product.name+" is R$ "+product.price+" now");
                break;
            case "2":
                Student Daniel = new Student("Daniel", 19);
                Daniel.Average();
                System.out.println("The students average is: "+Daniel.grade);
                break;
            case "3":
                CurrentAccount uva = new CurrentAccount(100,100);
                uva.withdraw(50);
                uva.earnings(20);
                break;
            case "4":

            case "5":
                Employee employee = new Employee("Daniel", 1000);
                Manager manager = new Manager("Temóteo", 2500, 1000);
                Employee[] employees = { employee, manager };

                Department department = new Department("Sales", employees);
                System.out.println("Total salary of the department: " + department.calculate());
                break;

        }

    }
}
