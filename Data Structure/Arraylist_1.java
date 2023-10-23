import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_1 {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);
        List<Integer> set = new ArrayList<>();

        System.out.println("Set the size of the first set: ");
        int tam = write.nextInt();

        for (int i = 0; i < tam; i++) {
            System.out.println("Enter a number: ");
            int number = write.nextInt();
            set.add(number);
        }

        System.out.println("The set is: " + set);

        System.out.println("Choose the operation you want: ");
        System.out.println("[1] Append\n[2] Remove\n[3] Recover");
        String choice = write.next();

        switch (choice.toLowerCase()) {
            case "1", "append":
                boolean stop1 = true;
                while (stop1) {
                    System.out.println("Do want append a number? Enter 'Yes' or 'No'");
                    String verify = write.next();

                    switch (verify.toLowerCase()) {
                        case "yes":
                            System.out.println("Enter the number you want append");
                            int numberAdd = write.nextInt();

                            for (int number : set) {
                                if (set.contains(numberAdd)) {
                                    System.out.println("This number already exists in the list");
                                    break;
                                } else {
                                    set.add(numberAdd);
                                    System.out.println("This number has been added to the list!");
                                    System.out.println("Now the list is: " + set);
                                    break;
                                }

                            }
                            break;

                        case "no":
                            System.out.println("Bye Bye!");
                            stop1 = false;
                            break;
                    }
                }
                break;

            case "2", "remove":
                boolean stop2 = true;
                while (stop2) {
                    System.out.println("Do want remove a number? Enter 'Yes' or 'No'");
                    String verify = write.next();

                    switch (verify.toLowerCase()) {
                        case "yes":
                            System.out.println("Enter the number you want remove");
                            int numberRemove = write.nextInt();
                            int index = 0;

                            if (set.contains(numberRemove)) {
                                for (int number : set) {
                                    if (number == numberRemove) {
                                        set.remove(numberRemove);
                                        System.out.println("Now the list is: " + set);
                                        break;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("O número não foi encontrado");
                                continue;
                            }

                        case "no":
                            System.out.println("Bye Bye!");
                            stop2 = false;
                            break;
                    }
                }
                break;

            case "3", "recover":
                boolean stop3 = true;
                while (stop3) {
                    System.out.println("Do want recover a number? Enter 'Yes' or 'No'");
                    String recover = write.next();

                    switch (recover.toLowerCase()) {
                        case "yes":
                            System.out.println("Enter the index of the number you want to retrieve: ");
                            int index = write.nextInt();

                            if (index >= 0 && index < set.size()) {
                                int retrievedNumber = set.get(index);
                                System.out.println("The number at index " + index + " is: " + retrievedNumber);
                            } else {
                                System.out.println("Index out of valid range.");
                            }
                            break;

                        case "no":
                            System.out.println("Bye Bye!");
                            stop3 = false;
                            break;

                    }
                }
        }
    }
}
