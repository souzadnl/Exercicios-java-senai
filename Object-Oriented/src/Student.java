import java.util.Scanner;

public class Student{

    public String name;
    public int age;
    public int grade;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Average() {
        Scanner write = new Scanner(System.in);
        System.out.println("How many grades will you enter?");
        int grades = write.nextInt();
        for(int i = 0; i < grades;i++) {
            System.out.println("Enter the grade: ");
            int gradeUser = write.nextInt();
            grade = grade + gradeUser;
        }
        grade = grade / grades;
    }
}