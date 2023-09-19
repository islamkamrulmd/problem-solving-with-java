import java.util.Scanner;

public class e8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        System.out.printf("Percentage of classes attended: %.2f%%%n", attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Allowed.");
        } else {
            System.out.println("Not allowed.");
        }
    }
}
