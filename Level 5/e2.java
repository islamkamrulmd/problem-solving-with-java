import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondValue = scanner.nextInt();

        scanner.close();

        int greatestValue = Math.max(firstValue, secondValue);
        System.out.println("The greatest value is: " + greatestValue);
    }
}
