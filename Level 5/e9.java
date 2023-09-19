import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        System.out.print("Do you have a medical cause? (Enter 'Y' for Yes, 'N' for No): ");
        char hasMedicalCause = scanner.next().charAt(0);

        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        System.out.printf("Percentage of classes attended: %.2f%%%n", attendancePercentage);

        if (attendancePercentage >= 75 || hasMedicalCause == 'Y' || hasMedicalCause == 'y') {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("You are not allowed to sit in the exam due to low attendance.");
        }
    }
}
