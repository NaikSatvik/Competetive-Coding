package Functions;

import java.util.Scanner;

public class Average {
    public static float calAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average:- "+calAverage(a, b, c));
        sc.close();
    }
}