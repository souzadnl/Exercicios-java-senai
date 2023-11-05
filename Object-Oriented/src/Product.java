import java.util.Scanner;

public class Product {
    String name;
    int price;

    public Product(String name,int price) {
        this.name = name;
        this.price = price;
    }

    public void Discount() {
        Scanner write = new Scanner(System.in);
        System.out.println("What discount amount do you want to apply?");
        int discount = write.nextInt();

        price = price - discount;
    }
}
