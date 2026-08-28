package basics.assigment_problems;

import java.util.Scanner;

public class PrintNumbers1ToN {

    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            printNumbersUpToN(n);
        }
        scanner.close();
    }
}
