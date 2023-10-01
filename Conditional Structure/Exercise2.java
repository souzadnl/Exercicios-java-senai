import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        int result = 0;

        System.out.println("Answer the 10 questions with the correct alternative: ");

        ///Question1
        System.out.println("What is the sum of 2 + 2?");
        System.out.println("a) 3\nb) 4\nc) 5\nd) 6");
        String choice1 = write.next();
        switch (choice1){
            case "a", "3":
                System.out.println("Wrong alternative, the correct answer was b) 4");
                break;
            case "b", "4":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "c", "5":
                System.out.println("Wrong alternative, the correct answer was b) 4");
                break;
            case "d", "6":
                System.out.println("Wrong alternative, the correct answer was b) 4");
                break;
        }
        /// final Question1

        ///Question2
        System.out.println("What is the main function of a computer's CPU?");
        System.out.println("a) Sending emails\nb) Playing music\nc) Executing instructions and calculations\nd) Printing documents");
        String choice2 = write.next();
        switch (choice2){
            case "a":
                System.out.println("Wrong alternative, the correct answer was c) Executing instructions and calculations");
                break;
            case "b":
                System.out.println("Wrong alternative, the correct answer was c) Executing instructions and calculations");
                break;
            case "c":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "d":
                System.out.println("Wrong alternative, the correct answer was c) Executing instructions and calculations");
                break;
        }
        /// final Question2

        ///Question3
        System.out.println("Which of the following is an example of a web browser?");
        System.out.println("a) Microsoft Word\nb) Google Chrome\nc) Photoshop\nd) Excel");
        String choice3 = write.next();
        switch (choice3){
            case "a":
                System.out.println("Wrong alternative, the correct answer was b) Google Chrome");
                break;
            case "b":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "c":
                System.out.println("Wrong alternative, the correct answer was b) Google Chrome");
                break;
            case "d":
                System.out.println("Wrong alternative, the correct answer was b) Google Chrome");
                break;
        }
        /// final Question3

        ///Question4
        System.out.println("What is the result of 7 + 3?");
        System.out.println("a) 9\nb) 11\nc) 5\nd) 10");
        String choice4 = write.next();
        switch (choice4){
            case "a", "9":
                System.out.println("Wrong alternative, the correct answer was d) 10");
                break;
            case "b", "11":
                System.out.println("Wrong alternative, the correct answer was d) 10");
                break;
            case "c", "5":
                System.out.println("Wrong alternative, the correct answer was d) 10");
                break;
            case "d", "10":
                System.out.println("Correct alternative!");
                result += 1;
                break;
        }
        /// final Question4

        ///Question5
        System.out.println("What does \"URL\" stand for?");
        System.out.println("a) Uniform Resource Locator\nb) Ultra Rapid Language\nc) Universal Reporting Language\nd) United Resource Library");
        String choice5 = write.next();
        switch (choice5){
            case "a":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "b":
                System.out.println("Wrong alternative, the correct answer was a) Uniform Resource Locator");
                break;
            case "c":
                System.out.println("Wrong alternative, the correct answer was a) Uniform Resource Locator");
                break;
            case "d":
                System.out.println("Wrong alternative, the correct answer was a) Uniform Resource Locator");
                break;
        }
        /// final Question5

        ///Question6
        System.out.println("If you multiply 5 by 3, what is the result?");
        System.out.println("a) 10\nb) 12\nc) 15\nd) 16");
        String choice6 = write.next();
        switch (choice6){
            case "a", "10":
                System.out.println("Wrong alternative, the correct answer was c) 15");
                break;
            case "b", "12":
                System.out.println("Wrong alternative, the correct answer was c) 15");
                break;
            case "c", "15":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "d", "16":
                System.out.println("Wrong alternative, the correct answer was c) 15");
                break;
        }
        /// final Question6

        ///Question7
        System.out.println("What is the term for a number that can only be divided by 1 and itself?");
        System.out.println("a) Prime number\nb) Even number\nc) Odd number\nd) Composite number");
        String choice7 = write.next();
        switch (choice7){
            case "a":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "b":
                System.out.println("Wrong alternative, the correct answer was a) Prime Number");
                break;
            case "c":
                System.out.println("Wrong alternative, the correct answer was a) Prime Number");
                break;
            case "d":
                System.out.println("Wrong alternative, the correct answer was a) Prime Number");
                break;
        }
        /// final Question7

        ///Question8
        System.out.println("Which shape has four equal sides and four right angles?");
        System.out.println("a) Circle\nb) Triangle\nc) Square\nd) Oval");
        String choice8 = write.next();
        switch (choice8){
            case "a", "circle":
                System.out.println("Wrong alternative, the correct answer was c) Square");
                break;
            case "b", "triangle":
                System.out.println("Wrong alternative, the correct answer was c) Square");
                break;
            case "c", "square":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "d", "oval":
                System.out.println("Wrong alternative, the correct answer was c) Square");
                break;
        }
        /// final Question8

        ///Question9
        System.out.println("Which of these devices is used for storing digital data?");
        System.out.println("a) Toaster\nb) Refrigerator\nc) USB\nd) Toilets");
        String choice9 = write.next();
        switch (choice9){
            case "a", "toaster":
                System.out.println("Wrong alternative, the correct answer was c) USB");
                break;
            case "b", "refrigerator":
                System.out.println("Wrong alternative, the correct answer was c) USB");
                break;
            case "c", "usb", "USB":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "d", "toilets":
                System.out.println("Wrong alternative, the correct answer was c) USB");
                break;
        }
        /// final Question9

        ///Question10
        System.out.println("What is the value of π (pi) approximately equal to?");
        System.out.println("a) 3.14\nb) 2.71\nc) 1.61\nd) 4.62");
        String choice10 = write.next();
        switch (choice10){
            case "a", "3.14", "3,14":
                System.out.println("Correct alternative!");
                result += 1;
                break;
            case "b", "2.71", "2,71":
                System.out.println("Wrong alternative, the correct answer was a) 3.14");
                break;
            case "c", "1.61", "1,62":
                System.out.println("Wrong alternative, the correct answer was a) 3.14");
                break;
            case "d", "4.62", "4,62":
                System.out.println("Wrong alternative, the correct answer was a) 3.14");
                break;
        }
        /// final Question10

        if (result == 10){
            System.out.println("Your final grade is: "+result);
            System.out.println("Congratulations, you excelled!!");
        } else if (result > 7) {
            System.out.println("Your final grade is: "+result);
            System.out.println("Your grade was good!");
        } else if (result > 4) {
            System.out.println("Your final grade is: "+result);
            System.out.println("You have reached the minimum");
        } else {
            System.out.println("Your final grade is: "+result);
            System.out.println("You didn't reach the minimum desirable");
        }

    }
}
