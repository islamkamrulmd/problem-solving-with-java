import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        scanner.close();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
