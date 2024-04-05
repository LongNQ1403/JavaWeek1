package StackHeap;

public class App {
    public static void main(String[] args) {

        // Khai báo và khởi tạo một biến nguyên được lưu trữ trên Stack
        int x = 10;
        System.out.println(x);

        // Tạo đối tượng và lưu trữ trên Heap
         Person person1 = new Person("Long", "Nguyen");
         System.out.println(person1);
         Person person2 = person1;
         System.out.println(person2);
         person2.setLastName("Quang");
         System.out.println(person1.getLastName());


    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "Name: " + firstName + " " + lastName + "!";
    // }
}
