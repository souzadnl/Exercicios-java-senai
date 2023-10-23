import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

public class Intersecao_5 {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        System.out.println("Set the size of the first set: ");
        int tam = write.nextInt();

        for(int i = 0; i < tam; i++){
            System.out.println("Enter a number: ");
            int number = write.nextInt();
            set1.add(number);
        }

        System.out.println("Now set the size of the second set: ");
        tam = write.nextInt();

        for(int i = 0; i < tam; i++){
            System.out.println("Enter a number: ");
            int number = write.nextInt();
            set2.add(number);
        }

        System.out.println("The first set is: " + set1);
        System.out.println("The second set is: " + set2);

        for(int number : set1){
            union.add(number);
        }
        for(int number : set2){
            union.add(number);
        }

        System.out.println("The union of these two sets is " + union);

        for(int number : set2){
            if (set1.contains(number)){
                intersection.add(number);
            }
        }

        for(int number : set1){
            if (set2.contains(number)){
                intersection.add(number);
            }
        }

        System.out.println("The intersection of these two sets is " + intersection);
    }
}
