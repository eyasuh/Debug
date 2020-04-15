import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        String Age = input.nextLine();
        System.out.print("Enter your DOB year: ");
        int dob = input.nextInt();
        System.out.println("Summary: Your name is: " + name + "\nYour age is: " + Age + "\nYour birth year is: " + dob);
    }
}
