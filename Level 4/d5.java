import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lenght: ");
        double length = sc.nextDouble();

        sc.close();

        double area = length * length;
        double perimeter = 4 * length;

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
