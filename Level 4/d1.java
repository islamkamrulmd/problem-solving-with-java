import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        sc.close();
    }
}
