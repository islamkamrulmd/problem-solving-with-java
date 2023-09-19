import java.util.Scanner;
public class c15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        
        if (number >= 100 && number <= 999) {
            int sum = (number / 100) + ((number / 10) % 10) + (number % 10);
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }
}


