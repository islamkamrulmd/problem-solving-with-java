import java.util.Scanner;

public class e10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        scanner.close();

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The entered character is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The entered character is uppercase.");
        } else {
            System.out.println("The entered character is not a letter.");
        }
    }
}
