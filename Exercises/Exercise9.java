import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        System.out.println("Burger options:\n1. X-Burguer\n2. X-Salada\n3. X-Frango\n4. X-Bacon\n5. X-Tudo\n6. X-Veggie\n7. X-Calabresa\n8. X-Fish\n9. X-Picanha\n");
        String choice = write.nextLine();
        float price = 0;
        switch (choice){
            case "1":
                System.out.println("1. X-Burguer_________R$ 12.99\n(Hamburger, Bread, Cheese)");
                price = (float) 12.99;
                return;
            case "2":
                System.out.println("2. X-Salada_________R$ 13.99\n(Hamburger, Lettuce, Tomato, Cheese)");
                price = (float) 13.99;
                return;
            case "3":
                System.out.println("3. X-Frango_________R$ 11.99\n(Grilled Chicken, Bread, Lettuce, Tomato)");
                price = (float) 11.99;
                return;
            case "4":
                System.out.println("4. X-Bacon__________R$ 14.99\n(Hamburger, Bacon, Bread, Cheese)");
                price = (float) 14.99;
                return;
            case "5":
                System.out.println("5. X-Tudo___________R$ 15.99\n(Hamburger, Bacon, Egg, Lettuce, Tomato, Cheese)");
                price = (float) 15.99;
                return;
            case "6":
                System.out.println("6. X-Veggie_________R$ 12.99\n(Vegetarian Patty, Bread, Lettuce, Tomato, Cheese)");
                price = (float) 12.99;
                return;
            case "7":
                System.out.println("7. X-Calabresa_______R$ 13.99\n(Calabrese Sausage, Bread, Onion, Bell Pepper, Cheese)");
                price = (float) 13.99;
                return;
            case "8":
                System.out.println("8. X-Fish____________R$ 14.99\n(Breaded Fish Fillet, Bread, Lettuce, Tartar Sauce)");
                price = (float) 14.99;
                return;
            case "9":
                System.out.println("9. X-Frango BBQ______R$ 15.99\n(Grilled Chicken, BBQ Sauce, Bread, Onion, Cheese)");
                price = (float) 15.99;
                return;
            case "10":
                System.out.println("10. X-Picanha_________R$ 16.99\n(Grilled Picanha Steak, Bread, Lettuce, Tomato, Cheese)");
                price = (float) 16.99;
                return;
            default:
                System.out.println("Burger not found");
        }
        System.out.println(price);

    }
}
