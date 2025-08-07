class Myclass {
    String name;
    int rollno;
    int age;
    void displayInfo(){
        System.out.println("Name:"+ name);
        System.out.println("Rollno:"+ rollno);
        System.out.println("Age:"+ age);
    }
}
public class main{
    public static void main(String[] args) {
        Myclass s1=new Myclass();
        s1.name="sushmitha";
        s1.rollno=61;
        s1.age=25;
        s1.displayInfo();
    }
}
