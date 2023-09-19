import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of the item in taka: ");
        double cost = scanner.nextDouble();

        scanner.close();

        if (cost > 1000) {
            double discount = 0.10 * cost;
            double discountedTotal = cost - discount;
            System.out.printf("Congratulations! You get a 10%% discount.%nTotal cost after discount: %.2f taka%n", discountedTotal);
        } else {
            System.out.printf("Total cost: %.2f taka%n", cost);
        }
    }
}
