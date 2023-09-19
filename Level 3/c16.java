import java.util.Scanner;

public class c16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int reversedNumber = (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);
            System.out.println("Reversed Number: " + reversedNumber);
        } else {
            System.out.println("Input is not a three-digit number.");
        }

        scanner.close();
    }
}
