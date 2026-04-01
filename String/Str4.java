import java.util.Scanner;

public class Str4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sequences = new String[n];
        for (int i = 0; i < n; i++) {
            sequences[i] = scanner.nextLine();
        }

        System.out.println("DNA Sequence Analysis:");

        for (int i = 0; i < n; i++) {
            String original = sequences[i];
            if (isPalindrome(original)) {
                System.out.println((i + 1) + ". " + original + " - Palindrome");
            } else {
                System.out.println((i + 1) + ". " + original + " - Not Palindrome");
            }
        }

        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        String lowerStr = str.toLowerCase();
        
        int start = 0;
        int end = lowerStr.length() - 1;

        while (start < end) {
            if (lowerStr.charAt(start) != lowerStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}