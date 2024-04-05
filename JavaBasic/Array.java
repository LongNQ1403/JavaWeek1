package JavaBasic;

public class Array {
    public static void main(String[] args) {
        // Declare 1D array
        String[] name = { "Giant SCR 2", "Trek Domane AL 2 Gen 4", "Giant Propel Advanced", "Liv Langma 0 Disc" };
        System.out.println("First element: " + name[0]);
        System.out.println("Last element: " + name[name.length-1]);

        // Declare 2D array
        int[][] number = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(number[i][j] + " ");

            System.out.println();
        }
    }
}
