import States.Companies;
import States.Languages;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        System.out.println("Enter the company you want information on");
        String choice = write.next();
        switch (choice.toLowerCase()) {
            case "apple":
                Companies.Apple();
                break;
            case "google":
                Companies.Google();
                break;
            case "microsoft":
                Companies.Microsoft();
                break;
            case "amazon":
                Companies.Amazon();
                break;
            case "facebook":
                Companies.Facebook();
                break;
            case "tesla":
                Companies.Tesla();
                break;
            case "ibm":
                Companies.IBM();
                break;
            case "oracle":
                Companies.Oracle();
                break;
            case "netflix":
                Companies.Netflix();
                break;
            default:
                System.out.println("Company not found.");
                break;
        }

    }
}
