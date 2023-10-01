import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Burger options:\n1. X-Burguer\n2. X-Salada\n3. X-Frango\n4. X-Bacon\n5. X-Tudo\n6. X-Veggie\n7. X-Calabresa\n8. X-Fish\n9. X-Picanha\n");
        System.out.println("If you want to exit the menu enter 'exit'");
        int start = 0;
        while (start == 0){
            String option = write.nextLine();

            switch (option){
                case "exit":
                    System.out.println("Thank you! see you next time");
                    start +=1;
                    break;
                case "1":
                    System.out.println("1. X-Burguer_________R$ 12.99\n(Hamburger, Bread, Cheese)");
                    continue;
                case "2":
                    System.out.println("2. X-Salada_________R$ 13.99\n(Hamburger, Lettuce, Tomato, Cheese)");
                    continue;
                case "3":
                    System.out.println("3. X-Frango_________R$ 11.99\n(Grilled Chicken, Bread, Lettuce, Tomato)");
                    continue;
                case "4":
                    System.out.println("4. X-Bacon__________R$ 14.99\n(Hamburger, Bacon, Bread, Cheese)");
                    continue;
                case "5":
                    System.out.println("5. X-Tudo___________R$ 15.99\n(Hamburger, Bacon, Egg, Lettuce, Tomato, Cheese)");
                    continue;
                case "6":
                    System.out.println("6. X-Veggie_________R$ 12.99\n(Vegetarian Patty, Bread, Lettuce, Tomato, Cheese)");
                    continue;
                case "7":
                    System.out.println("7. X-Calabresa_______R$ 13.99\n(Calabrese Sausage, Bread, Onion, Bell Pepper, Cheese)");
                    continue;
                case "8":
                    System.out.println("8. X-Fish____________R$ 14.99\n(Breaded Fish Fillet, Bread, Lettuce, Tartar Sauce)");
                    continue;
                case "9":
                    System.out.println("9. X-Frango BBQ______R$ 15.99\n(Grilled Chicken, BBQ Sauce, Bread, Onion, Cheese)");
                    continue;
                case "10":
                    System.out.println("10. X-Picanha_________R$ 16.99\n(Grilled Picanha Steak, Bread, Lettuce, Tomato, Cheese)");
                    continue;
                default:
                    System.out.println("Burger not found");
            }


        }
    }
}
