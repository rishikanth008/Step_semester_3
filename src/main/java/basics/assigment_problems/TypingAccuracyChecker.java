public class TypingAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int total = original.length();
        int firstMismatchPos = -1;
        char origChar = ' ', typedChar = ' ';

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
                origChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        double accuracy = ((double) matched / total) * 100;
        String mismatchInfo = (firstMismatchPos == -1)
                ? "No Mismatches"
                : "First Mismatch at position " + firstMismatchPos + " ('" + origChar + "' vs '" + typedChar + "')";

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | %s%n", matched, total, accuracy, mismatchInfo);
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}