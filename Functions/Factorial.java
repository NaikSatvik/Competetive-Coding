package Functions;
import java.util.Scanner;

public class Factorial {
    public static int calFact(int num) {
        if (num<0) {
            System.out.println("Invalid Number.");
            System.exit(0);
        }
        int fact = 1;
        for (int i=num;i>=1;i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculate factorial of :- ");
        int n = sc.nextInt();
        System.out.println(calFact(n));
        sc.close();
    }
}