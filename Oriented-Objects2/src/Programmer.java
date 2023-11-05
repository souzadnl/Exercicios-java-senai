public class Programmer extends Employee {
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Total Salary: " + calculateSalary());
    }
}