import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Str8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Anagram Check:");
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            
            if (words.length == 2) {
                String str1 = words[0];
                String str2 = words[1];
                
                if (isAnagram(str1, str2)) {
                    System.out.println(i + ". " + str1 + " & " + str2 + " -> Anagram");
                } else {
                    System.out.println(i + ". " + str1 + " & " + str2 + " -> Not Anagram");
                }
            }
        }
        sc.close();
    }
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}