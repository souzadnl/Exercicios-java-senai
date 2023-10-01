import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Choose the draw:\n[1] Square\n[2] Circle\n[3] Triangle\n[4] Rectangle");

        String choice = write.next();
        switch (choice){
            case "1", "square":
                System.out.println("Square:");
                System.out.println("##########\n##########\n##########\n##########");
                break;
            case "2", "circle":
                System.out.println("Circle:");
                System.out.println("   ########  \n ############ \n##############\n##############\n ############ \n   ########  ");
                break;
            case "3", "triangle":
                System.out.println("Triangle:");
                System.out.println("      #       \n     ###      \n    #####     \n   #######    \n  #########   \n ###########  \n#############");
                break;
            case "4", "rectangle":
                System.out.println("Rectangle:");
                System.out.println("##################\n##################\n##################\n##################");
                break;
        }
    }
}
