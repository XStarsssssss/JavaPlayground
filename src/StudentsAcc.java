import java.util.Scanner;

public class StudentsAcc {
    private Students[] studentsAcc;

    public StudentsAcc(){
        this.studentsAcc = new Students[2];
    }
//    public void Acc(){
//        if (Id <= 0){
//            System.out.println("Invalid ID");
//        }
//        Id = Id;
//        if (Name == null){
//            System.out.println("Invalid Name");
//        }
//        Name = Name;
//        if (age <= 0){
//            System.out.println("Invalid Age");
//        }
//        age = age;
//    }
    public void Acc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name");
        String Name = scanner.next();
        System.out.println("age");
        int age = scanner.nextInt();
//        System.out.println("Name :"+ Name);
//        System.out.println("Age :"+age);

        Students students = new Students(1,Name,age);
        students.show();
    }
}
