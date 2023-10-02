package Library;

import java.util.Scanner;

public class Library {

    public static float Square(float area){
        Scanner write = new Scanner(System.in);
        float side = write.nextFloat();
        float area = side * side;
        return;
    }

    public static void Rectangle(){
        Scanner write = new Scanner(System.in);
        System.out.println("Enter the value of the weight: ");
        float weight = write.nextFloat();
        System.out.println("Enter the value of the height: ");
        float height = write.nextFloat();
        float area = height * weight;
        System.out.println("The area of the rectangle is "+Math.round(area));
    }

    public static void Triangle(){
        Scanner write = new Scanner(System.in);
        System.out.println("Enter the value of the base: ");
        float base = write.nextFloat();
        System.out.println("Enter the value of the height: ");
        float height = write.nextFloat();
        float area = (base * height)/2;
        System.out.println("The area of the triangle is "+Math.round(area));
    }

    public static void Circle(){
        Scanner write = new Scanner(System.in);
        float PI = 3.14159265359f;
        System.out.println("Enter the value of the radius: ");
        float radius = write.nextFloat();
        float area = PI * (radius * radius);
        System.out.println("The area of the circle is "+Math.round(area));
    }


}
