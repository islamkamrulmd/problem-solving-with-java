import java.util.Scanner;
public class d7 {
    public static void main(String[] args) {
        String name1;
        String name2;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your first string: ");
        name1 = sc.nextLine ();

        System.out.println("Enter your second string: ");
        name2 = sc.nextLine ();

        System.out.println(" Two strings are: " +name1+name2);
        sc.close ();

        
    }
}
