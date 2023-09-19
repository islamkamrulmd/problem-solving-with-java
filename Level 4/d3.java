import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("Area is: " + area);

        sc.close();
    }
}