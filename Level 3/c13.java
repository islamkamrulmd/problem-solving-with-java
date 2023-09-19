import java.util.Scanner;
public class c13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
        int firstDigit = number / 10000;
        int secondLastDigit = (number / 10) % 10;
        int sum = firstDigit + secondLastDigit;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
