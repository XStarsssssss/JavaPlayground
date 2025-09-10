import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double bases = scanner.nextDouble();
//        double hight = scanner.nextDouble();
//        Formula formula = new Formula();
//        formula.area(bases,hight);
//        formula.check();
        //Assignment
//        Assignment assignment = new Assignment();
//        System.out.print("Enter x of value: ");
//        double x=scanner.nextInt();
//        System.out.print("Enter y of value: ");
//        double y = scanner.nextInt();
//        assignment.xy(x,y);
//        assignment.check();
        //Assignment1
//        System.out.print("Enter Username: ");
//        String username = scanner.nextLine();
//        System.out.print("Enter Email: ");
//        String email = scanner.nextLine();
//        System.out.print("Enter Password: ");
//        String password = scanner.nextLine();
//        Assignment1 assignment1 = new Assignment1();
//        assignment1.account(username,email,password);
//        assignment1.checkall();
//        Lyrics lyrics = new Lyrics();
//        lyrics.PrintLyrics();
//        StudentsAcc acc = new StudentsAcc();
//        acc.Acc();
        int salary = scanner.nextInt();
        int extrahourpayrate = scanner.nextInt();
        int extrahour = scanner.nextInt();
        Empoyee em = new Empoyee(salary,extrahourpayrate,extrahour);
        em.calculateTotalSalary();
        em.result();
    }
}