import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        String[] emails = new String[n];
        int validCount = 0;
        int invalidCount = 0;
        System.out.println("Email Validation Results:");

        for (int i = 0; i < n; i++) {
            emails[i] = sc.nextLine();
            boolean isValid = validateEmail(emails[i]);

            if (isValid) {
                validCount++;
                System.out.println((i + 1) + ". " + emails[i] + " - Valid");
            } else {
                invalidCount++;
                System.out.println((i + 1) + ". " + emails[i] + " - Invalid");
            }
        }

        System.out.println("Total Valid: " + validCount);
        System.out.println("Total Invalid: " + invalidCount);
        
        sc.close();
    }
    public static boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) return false;
        if (email.startsWith("@") || email.startsWith(".") || 
            email.endsWith("@") || email.endsWith(".")) {
            return false;
        }
        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (firstAt == -1 || firstAt != lastAt) {
            return false;
        }
        int dotAfterAt = email.indexOf('.', firstAt + 1);
        if (dotAfterAt == -1) {
            return false;
        }
        return true;
    }
}
