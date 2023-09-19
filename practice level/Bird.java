public class Bird {
    // Instance variables
    private String name;
    private String color;
    private int age;

    // Constructor to initialize the bird object
    public Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Display method to print bird attributes
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Bird object using the constructor
        Bird moyna = new Bird("moyna", "gray", 6);

        // Call the display method to print attributes
        System.out.println("Bird Information:");
        moyna.displayAttributes();
    }
}
