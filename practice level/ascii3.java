public class ascii3 {
    public static void main(String[] args) {
        char originalChar = 'd';
        int asciiValue = (int) originalChar; // Get the ASCII value of the character
        
        int newAsciiValue = asciiValue + 3; // Add 3 to the ASCII value
        
        char newChar = (char) newAsciiValue; // Convert the new ASCII value back to a character
        
        System.out.println("Original character: " + originalChar);
        System.out.println("New character after adding 3: " + newChar);
    }
}