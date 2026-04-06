import java.util.Scanner;
import java.lang.String;
public class Str11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Sanitized Inputs:");
        for (int i = 1; i <= n; i++) {
            String original = sc.nextLine();
            String sanitized = original.replace("'", "''");
            System.out.println(i + ". " + original + " -> " + sanitized);
        }
        sc.close();
    }
}