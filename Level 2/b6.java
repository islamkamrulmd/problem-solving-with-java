public class b6 {
    public static void main(String[] args) {
        char c = 'd';
        int ascii = (int) c;
        int newvalue = ascii + 3;


        System.out.println ("The ascii value of d is: " + ascii);
        System.out.println ("After add 3, the new value is: " +newvalue );
        
        char equivalent = (char) newvalue ;
        System.out.println("The equivalent character of 103 is: " +equivalent );


    }
}