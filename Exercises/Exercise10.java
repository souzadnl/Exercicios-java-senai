import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        System.out.println("Burger options:\n01. X-Burguer\n02. X-Salada\n03. X-Frango\n04. X-Bacon\n05. X-Tudo");
        String choice = write.nextLine();
        float price = 0.0F;
        String burguer = "";

        switch (choice) {
            case "1", "01":
                System.out.println("1. X-Burguer_________R$ 12.99\n(Hamburger, Bread, Cheese)");
                burguer = "X-Burguer";
                price = 12.99F;
                break;
            case "2", "02":
                System.out.println("2. X-Salada_________R$ 13.99\n(Hamburger, Lettuce, Tomato, Cheese)");
                burguer = "X-Salada";
                price = 13.99F;
                break;
            case "3", "03":
                System.out.println("3. X-Frango_________R$ 11.99\n(Grilled Chicken, Bread, Lettuce, Tomato)");
                burguer = "X-Frango";
                price = 11.99F;
                break;
            case "4", "04":
                System.out.println("4. X-Bacon__________R$ 14.99\n(Hamburger, Bacon, Bread, Cheese)");
                burguer = "X-Bacon";
                price = 14.99F;
                break;
            case "5", "05":
                System.out.println("5. X-Tudo___________R$ 15.99\n(Hamburger, Bacon, Egg, Lettuce, Tomato, Cheese)");
                burguer = "X-Tudo";
                price = 15.99F;
                break;
            default:
                System.out.println("Burger not found");
        }

        System.out.println("Choose quantity\nEnter the number of "+burguer+" you want");
        int order = write.nextInt();
        if (order==1){
            System.out.println("\nOrder:\n"+order +" "+ burguer +"=" + price);
        } else if (order <= 0){
            System.out.println("\nThis is not a valid number");
        } else {
            System.out.println("\nOrder:\n"+order +" "+ burguer + "s = " + (price*order));
        }

    }
}
