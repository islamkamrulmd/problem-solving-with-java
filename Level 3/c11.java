import java.util.Scanner;
public class c11 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
        
       double far;
       
       System.out.println("Enter the temp in Fahrenheit ");
       far = sc.nextDouble();
       double cel = (far - 32) * 5.0/9.0;
       System.out.println(+far + "Fahrenheit is = " +cel + " degree in celsius" );
       
       sc.close ();

        
    }

}
