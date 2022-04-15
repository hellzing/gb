import java.util.Scanner;

public class Homework2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Task1. enter the first value: ");
        int x = sc.nextInt();
        System.out.println("Task1. enter the second value: ");
        int y = sc.nextInt();
        System.out.println(between(x, y));

        System.out.println("Task2. enter a positive or a negative number: ");
        int z = sc.nextInt();
        posNeg(z);

        System.out.println("Task3. enter a positive or a negative number: ");
        int f = sc.nextInt();
        System.out.println(posNegBool(f));

        System.out.println("Task4. enter a string value: ");
        String s = sc.next();
        System.out.println("Task4. enter a number of strings: ");
        int n = sc.nextInt();
        printStr(s, n);

        System.out.println("Task5. enter a year: ");
        int yr = sc.nextInt();
        System.out.println(yCheck(yr));
    }

    public static boolean between(int x, int y) {
        return (((x + y) >= 10) & ((x + y) <= 20));
    }

    public static void posNeg(int x) {
        if (x >= 0) {
            System.out.println("The value is positive");
        } else {
            System.out.println("The value is negative");
        }
    }

    public static boolean posNegBool(int x) {
        return (x >= 0);
    }

    public static void printStr(String x, int y) {
        for (int i = 1; i <= y; i++) {
            System.out.println(x);
        }
    }

    public static boolean yCheck(int x) {
        return ((x % 400) == 0) || (((x % 4) == 0) & (x % 100 != 0));
    }
}


