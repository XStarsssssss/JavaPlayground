import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double bases = scanner.nextDouble();
//        double hight = scanner.nextDouble();
//        Formula formula = new Formula();
//        formula.area(bases,hight);
//        formula.check();


        Assignment assignment = new Assignment();
        System.out.print("Enter x of value: ");
        double x=scanner.nextInt();
        System.out.print("Enter y of value: ");
        double y = scanner.nextInt();
        assignment.x(x,y);
        assignment.check();
    }
}