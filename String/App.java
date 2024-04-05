package String;

public class App {
    public static void main(String[] args) {
        // Sử dụng String
        String str1 = "Hello"; // Chuỗi được lưu trong String Pool
        String str2 = new String("Hello"); // Chuỗi mới được tạo trong Heap

        // Sử dụng StringBuffer
        StringBuffer buffer = new StringBuffer("Hello"); // StringBuffer

        // Sử dụng StringBuilder
        StringBuilder builder = new StringBuilder("Hello"); // StringBuilder
        
        // Kiểm tra tham chiếu và giá trị của các chuỗi
        System.out.println("Check reference of strings");
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 == buffer: " + (str1 == buffer.toString())); // false
        System.out.println("str1 == builder: " + (str1 == builder.toString())); // false

        // Kiểm tra giá trị của các chuỗi
        System.out.println("\nCheck value of strings");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(buffer): " + str1.equals(buffer.toString())); // true
        System.out.println("str1.equals(builder): " + str1.equals(builder.toString())); // true
    }
}
