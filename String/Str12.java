import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
public class Str12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Parsed Fields:");
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine();
            List<String> fields = parseCSVLine(line);
            System.out.println(i + ". " + fields.toString());
        }
        sc.close();
    }
    public static List<String> parseCSVLine(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder currentField = new StringBuilder();
        boolean inQuotes = false;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '\"') {
                inQuotes = !inQuotes;
                currentField.append(c);
            } else if (c == ',' && !inQuotes) {
                result.add(currentField.toString().trim());
                currentField.setLength(0);
            } else {
                currentField.append(c);
            }
        }
        result.add(currentField.toString().trim());
        return result;
    }
}