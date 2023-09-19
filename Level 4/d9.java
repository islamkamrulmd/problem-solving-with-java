import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for 'b': ");
        int b = scanner.nextInt();

        if (a < 50 && a < b) {
            System.out.println("Both conditions 'a < 50' and 'a < b' are true.");
        } else {
            System.out.println("At least one of the conditions is false.");
        }

        scanner.close();
    }
}   
