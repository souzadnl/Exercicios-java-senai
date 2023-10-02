import Library.Library;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        System.out.println("[1] Square\n[2] Rectangle\n[3] Triangle\n[4] Circle");
        System.out.println("Choose the area do you want to know: ");
        String choice = write.next();

        switch (choice.toLowerCase()){
            case "1", "square":
                System.out.println("Enter the value of the side: ");
                Library.Square();
                System.out.println("The area of the square is "+;
                break;
            case "2", "rectangle":
                Library.Rectangle();
                break;
            case "3", "triangle":
                Library.Triangle();
                break;
            case "4", "circle":
                Library.Circle();
                break;
        }

    }

}
