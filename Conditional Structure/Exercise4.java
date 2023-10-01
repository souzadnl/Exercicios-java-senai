import States.Languages;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        System.out.println("Enter the language you want information on");
        String choice = write.next();
        switch (choice.toLowerCase()) {
            case "java":
                Languages.Java();
                break;
            case "python":
                Languages.Python();
                break;
            case "javascript":
                Languages.JavaScript();
                break;
            case "c#":
                Languages.CSharp();
                break;
            case "ruby":
                Languages.Ruby();
                break;
            case "go":
                Languages.Go();
                break;
            case "kotlin":
                Languages.Kotlin();
                break;
            case "typescript":
                Languages.TypeScript();
                break;
            case "php":
                Languages.PHP();
                break;
            case "c++":
                Languages.CPlusPlus();
                break;
            default:
                System.out.println("Language not found.");
                break;
        }

    }
}
