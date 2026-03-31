import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Password Analysis:");
        for (int i = 1; i <= n; i++) {
            String password = sc.nextLine();
            analyzePassword(i, password);
        }
        sc.close();
    }
    public static void analyzePassword(int index, String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialChars = "!@$%^&";
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialChars.indexOf(c) != -1) hasSpecial = true;
        }
        List<String> reasons = new ArrayList<>();
        if (password.length() < 8) reasons.add("Length < 8");
        if (!hasUpper) reasons.add("Missing upper");
        if (!hasLower) reasons.add("Missing lower");
        if (!hasDigit) reasons.add("Missing digit");
        if (!hasSpecial) reasons.add("Missing special");

        if (reasons.isEmpty()) {
            System.out.println(index + ". " + password + " - Strong");
        } else {
            System.out.println(index + ". " + password + " - Weak (" + String.join(", ", reasons) + ")");
        }
    }
}
