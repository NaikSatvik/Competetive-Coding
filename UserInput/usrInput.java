package UserInput;

import java.util.*;

class usrInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("My name is " + name + "\nSum = " + sum);
        sc.close();
    }
}