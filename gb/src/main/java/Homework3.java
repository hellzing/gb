import java.util.Scanner;
import java.util.Arrays;


public class Homework3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task1:");
        revertArr();

        System.out.println("Task2:");
        arr100();

        System.out.println("Task3:");
        multBy2();

        System.out.println("Task4:");
        table1();

        System.out.println("Task5. enter the length of the array: ");
        int x = sc.nextInt();
        System.out.println("Task5. enter the initial value: ");
        int y = sc.nextInt();
        arrLen(x, y);

        System.out.println("Task6:");
        minMax();

    }

    public static void revertArr() {
        int[] arr = {1, 1, 0, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i]--;
            arr[i] = Math.abs(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arr100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multBy2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void table1() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if ((i == j) || (i == Math.abs(j - table.length + 1))) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    public static void arrLen(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        System.out.println(Arrays.toString(arr));
    }

    public static void  minMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if  (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min +"; Max: "+ max);
    }
}
