import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bases = scanner.nextDouble();
        double hight = scanner.nextDouble();
        Formula formula = new Formula();
        formula.area(bases,hight);
        formula.check();
    }
}