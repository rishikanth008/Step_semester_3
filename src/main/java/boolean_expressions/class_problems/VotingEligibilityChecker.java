package boolean_expressions.class_problems;

import java.util.Scanner;

public class VotingEligibilityChecker {

    // Method to check voting eligibility
    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            checkVotingEligibility(age);
        }
        
        scanner.close();
    }
}
