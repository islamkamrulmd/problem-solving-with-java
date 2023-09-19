import java.util.Scanner;
public class d4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine ();

    System.out.println("ENter your roll number: ");
    String roll = sc.nextLine ();

    System.out.println("Enkamrulter your interest of field: ");
    String interest = sc.nextLine ();

    System.out.println("Hey " + "My name is "+ name + 
     ", My roll number is " +roll + " and My field of interest is: " + interest);
     sc.close ();

    }
}
