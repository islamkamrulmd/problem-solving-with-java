import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of years of service: ");
        int yearsOfService = sc.nextInt();

        sc.close();

        if (yearsOfService > 5) {
            double bonus = 0.05 * yearsOfService;
            System.out.printf("Congratulations! You are eligible for a %.2f%% bonus.%n", bonus * 100);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }
    }
}
