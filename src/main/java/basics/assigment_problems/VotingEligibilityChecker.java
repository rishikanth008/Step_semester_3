package basics.assigment_problems;

import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            checkVotingEligibility(age);
        }
        scanner.close();
    }
}
