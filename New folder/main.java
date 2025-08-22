import java.util.Scanner;

class Myclass {
    String name;
    int rollno;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Age: " + age);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Myclass s1 = new Myclass();

        System.out.print("Enter name: ");
        s1.name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        s1.rollno = scanner.nextInt();

        System.out.print("Enter age: ");
        s1.age = scanner.nextInt();

        s1.displayInfo();

        scanner.close();
    }
}
