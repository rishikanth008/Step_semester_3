package basics.assigment_problems;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            sumOfNaturalNumbers(n);
        }
        scanner.close();
    }
}
