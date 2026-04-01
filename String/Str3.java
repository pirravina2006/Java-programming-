import java.util.Scanner;
public class Str3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String input = sc.nextLine();
        if (input.isEmpty()) {
            System.out.println("Original: ");
            System.out.println("Compressed: ");
            System.out.println("Compression Ratio: 0.00%");
            return;
        }
        String compressed = compressRLE(input);
        double originalLen = input.length();
        double compressedLen = compressed.length();
        double ratio = ((originalLen - compressedLen) / originalLen) * 100;
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
        System.out.printf("Compression Ratio: %.2f%%\n", ratio);
        sc.close();
    }

    public static String compressRLE(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
        }

        return sb.toString();
    }
}