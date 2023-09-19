import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age of person 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter the age of person 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter the age of person 3: ");
        int age3 = scanner.nextInt();

        scanner.close();

        int oldestAge, youngestAge;

        oldestAge = youngestAge = age1;
        
        if (age2 > oldestAge) {
            oldestAge = age2;
        } else if (age2 < youngestAge) {
            youngestAge = age2;
        }

        if (age3 > oldestAge) {
            oldestAge = age3;
        } else if (age3 < youngestAge) {
            youngestAge = age3;
        }

        System.out.println("Oldest person's age: " + oldestAge);
        System.out.println("Youngest person's age: " + youngestAge);
    }
}
