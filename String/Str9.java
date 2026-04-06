import java.util.Scanner;
import java.lang.String;
public class Str9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Version Comparison:");
        for (int i = 1; i <= n; i++) {
            String v1 = sc.next();
            String v2 = sc.next();
            String result = compareVersions(v1, v2);
            System.out.println(i + ". " + v1 + " vs " + v2 + " -> " + result);
        }
        sc.close();
    }
    public static String compareVersions(String v1, String v2) {
        String[] parts1 = v1.split("\\.");
        String[] parts2 = v2.split("\\.");
        int maxLength = Math.max(parts1.length, parts2.length);
        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < parts1.length) ? Integer.parseInt(parts1[i]) : 0;
            int num2 = (i < parts2.length) ? Integer.parseInt(parts2[i]) : 0;
            if (num1 > num2) {
                return "v1 is Newer";
            } else if (num2 > num1) {
                return "v2 is Newer";
            }
        }
        return "Equal";
    }
}