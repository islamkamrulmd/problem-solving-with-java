import java.util.Scanner;

public class d8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for 'b': ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for 'c': ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All values (a, b, c) are equal.");
        } else if (a == b || b == c || a == c) {
            System.out.println("At least two values are equal.");
        } else {
            System.out.println("Please enter valid input.");
        }

        scanner.close();
    }
}
