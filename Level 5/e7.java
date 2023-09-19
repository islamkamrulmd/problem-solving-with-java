import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        double absoluteValue = Math.abs(number);

        System.out.println("Absolute value: " + absoluteValue);
    }
}
