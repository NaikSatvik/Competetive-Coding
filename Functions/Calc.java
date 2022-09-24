package Functions;
import java.util.*;

public class Calc {
    public static int Sum(int a, int b) {
        return a + b;
    }
    public static int Mul(int a, int b) {
        return a * b;
    }
    public static int Sub(int a, int b) {
        return a - b;
    }
    public static int Div(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A:- ");
        int a = sc.nextInt();
        System.out.print("B:- ");
        int b = sc.nextInt();
        System.out.print("Choice:- ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: System.out.println(Sum(a, b));
                    break;
            case 2: System.out.println(Sub(a, b));
                    break;
            case 3: System.out.println(Mul(a, b));
                    break;
            case 4: System.out.println(Div(a, b));
                    break;
        }
        sc.close();
    }
}