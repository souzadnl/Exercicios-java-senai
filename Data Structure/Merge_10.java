import java.util.*;

public class Merge_10 {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Set the size of the map: ");
        int tam = write.nextInt();
        int i = 0;

        while (i < tam) {
            System.out.println("Enter the name");
            String name = write.next();

            System.out.println("Enter the age");
            int age = write.nextInt();

            map.put(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase(), age);
            i = i + 1;
        }

        for (Map.Entry<String, Integer> line : map.entrySet()) {
            System.out.println(line.getKey() + " - " + line.getValue());
        }

        System.out.println("Choose the operation you want: ");
        System.out.println("[1] Updating\n[2] Adding");
        String choice = write.next();

        switch (choice.toLowerCase()){
            case "1":
                System.out.println("Which person's age do you want to change?");
                String name = write.next();
                String newName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

                if (map.containsKey(newName)){
                    System.out.println("Enter this person's new age: ");
                    int age = write.nextInt();

                    map.merge(newName, age, (valorExistente, novoValor) -> novoValor);
                    System.out.println("Now the map is: ");
                    for (Map.Entry<String, Integer> line : map.entrySet()) {
                        System.out.println(line.getKey() + " - " + line.getValue());
                    }
                    break;
                } else {
                    System.out.println("Person not found");
                    break;
                }


            case "2":
                System.out.println("Which person's age do you want to add?");
                String nameAdd = write.next();
                String newNameAdd = nameAdd.substring(0, 1).toUpperCase() + nameAdd.substring(1).toLowerCase();

                System.out.println("Enter this person's new age: ");
                int age = write.nextInt();

                map.merge(newNameAdd, age, (valorExistente, novoValor) -> novoValor);
                System.out.println("Now the map is: ");
                for (Map.Entry<String, Integer> line : map.entrySet()) {
                    System.out.println(line.getKey() + " - " + line.getValue());
                }

        }
    }
}
