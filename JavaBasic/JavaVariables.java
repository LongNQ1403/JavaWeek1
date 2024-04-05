package JavaBasic;

/**
 * JavaVariables
 */
public class JavaVariables {

    // Declared static variable
    private static String name = "Giant SCR 2";

    // Declared Instance Variable
    private String str;
    private int number;

    // Default Constructor
    public JavaVariables() {
        // initializing Instance Variable
        this.str = "Default string";
        this.number = 24;
    }

    // Constructor with parameter
    public JavaVariables(String str, int number) {
        this.str = str;
        this.number = number;
    }

    public static void main(String[] args) {

        // Declared a Local Variable
        int number1 = 10;

        // This variable is local to this main method only
        System.out.println("Local Variable: " + number1);

        // Object Creation
        JavaVariables obj1 = new JavaVariables();
        JavaVariables obj2 = new JavaVariables("Got it", 12);

        // Display
        System.out.println("Object 1");
        System.out.println(obj1.str + ", " + obj1.number);
        System.out.println("Object 2");
        System.out.println(obj2.str + ", " + obj2.number);

        // static variable
        System.out.println("String of static variable is: " + JavaVariables.name);
    }
}