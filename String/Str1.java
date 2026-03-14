import java.util.Scanner;
import java.lang.String;
public class Str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int valid = 0;
        int invalid = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if ((c == '@' || c == '.') && j != 0 && j != str.length()-1) {
                    count++;
                }
            }
            if (count>0) {
                System.out.println("Valid");
                valid++;
            } else {
                System.out.println("Invalid");
                invalid++;
            }
        }
        System.out.println("Total Valid: " + valid);
        System.out.println("Total Invalid: " + invalid);
        sc.close();
    }
}