import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num1;
        int num2;

        System.out.println("Enter the value of x:");
        num1 = sc.nextInt ();
        System.out.println("x = " + num1);
        
        System.out.println("Enter the value of y:");
        num2 = sc.nextInt ();
        System.out.println("y = " + num2);
        
        int sum = num1 + num2;
        System.out.println("Now the sum of num1 and num2 is: " +sum );
        

    
        sc.close ();

        
    }
    
}

