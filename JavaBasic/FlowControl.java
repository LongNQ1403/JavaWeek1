package JavaBasic;

public class FlowControl {
    public static void main(String[] args) {
        int i = 20;
        // If else statements
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
 
        // Switch case
        int num = 20;
        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");
        }
        // For loop
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        // While loop
        while (i < 23) {
            System.out.println("Hello!");
            i++;
        }
        // Do-while loop
        do {
            System.out.println("Print 1 time");
        } while (i < 20);
    }
}
