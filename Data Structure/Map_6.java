import java.util.*;

public class Map_6 {
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

        System.out.println("The map is: " + map);

        System.out.println("Choose the operation you want: ");
        System.out.println("[1] Ordenate by key\n[2] Ordenate by name\n[3] Maximum value\n[4] Minimum value");
        String choice = write.next();

        switch (choice.toLowerCase()){
            case "1":
                TreeMap<String, Integer> mapAlfabetic = new TreeMap<>(map);
                System.out.println("This is the map in alphabetical order: ");

                for(Map.Entry<String, Integer> line : mapAlfabetic.entrySet())
                    System.out.println(line.getKey() + " - " + line.getValue());

                System.out.println("The names in alphabetic order: ");
                for(Map.Entry<String, Integer> line : mapAlfabetic.entrySet())
                    System.out.print(line.getKey() + " ");
                System.out.println();
                break;

            case "2":
                TreeMap<String, Integer> mapValue = new TreeMap<>(map);

                System.out.println("This is the map in ascending order: ");
                for (Map.Entry<String, Integer> line : mapValue.entrySet()) {
                    System.out.println(line.getKey() + " - " + line.getValue());
                }

                System.out.println("The values in ascending order: ");
                for(Map.Entry<String, Integer> number : mapValue.entrySet())
                    System.out.print(number.getValue() + " ");
                System.out.println();
                break;

            case "3":
                TreeMap<String, Integer> mapValue3 = new TreeMap<>(map);
                List<Integer> maxValue = new ArrayList<>();

                for (Map.Entry<String, Integer> line : mapValue3.entrySet()) {
                    int number = line.getValue();
                    maxValue.add(number);
                }
                System.out.println("The biggest value on this map is: " + Collections.max(maxValue));
                break;

            case "4":
                TreeMap<String, Integer> mapValue4 = new TreeMap<>(map);
                List<Integer> minValue = new ArrayList<>();

                for (Map.Entry<String, Integer> line : mapValue4.entrySet()) {
                    int number = line.getValue();
                    minValue.add(number);
                }
                System.out.println("The smallest value in this list is: " + Collections.min(minValue));
                break;
        }
    }
}


