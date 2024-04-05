package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        // Khởi tạo một danh sách (List) để lưu trữ các chuỗi
        List<String> stringList = new ArrayList<>();
        // Thêm các phần tử vào danh sách
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");

        // In ra danh sách ban đầu
        System.out.println("Initial List:");
        System.out.println(stringList);

        // Truy cập các phần tử của danh sách bằng Iterator
        for (String string : stringList) {
            System.out.println(string);
        }
        // Xóa một phần tử khỏi danh sách
        stringList.remove("banana");

        // In ra danh sách sau khi xóa
        System.out.println("\nList after removal:");
        System.out.println(stringList);

        // Khởi tạo một Set để lưu trữ các số nguyên
        Set<Integer> numberSet = new HashSet<>();

        // Thêm các phần tử vào Set
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(10); // Phần tử trùng lặp, không được thêm vào

        // In ra số lượng phần tử trong Set
        System.out.println("Size of the set: " + numberSet.size());

        // In ra các phần tử 
        for (Integer integer : numberSet) {
            System.out.println(integer);
        }
    }
}
