package Condions_and_loops;

import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//      Q: Find the largest of the 3 numbers
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

//     int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}