import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = write.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = write.nextInt();

        System.out.println("Now choose the operation you want");
        System.out.println("[+] addition\n[-] subtraction\n[/] division\n[*] multiplication");
        System.out.println("Enter the symbol or the name of the operation do you want:");
        String choice = write.next();

        switch (choice) {
            case "+", "addiction":
                System.out.println("The result of operation is: "+(firstNumber + secondNumber));
                break;
            case "-", "subtraction":
                System.out.println("The result of operation is: "+(firstNumber - secondNumber));
                break;
            case "/", "division":
                System.out.println("The result of operation is: "+(firstNumber / secondNumber));
                break;
            case "*", "multiplication":
                System.out.println("The result of operation is: "+(firstNumber * secondNumber));
                break;
        }

    }
}
