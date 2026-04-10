import java.util.Scanner;

public class Str5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] urls = new String[n];
        for (int i = 0; i < n; i++) {
            urls[i] = scanner.nextLine();
        }

        System.out.println("URL Analysis:");
        for (int i = 0; i < n; i++) {
            String domain = extractDomain(urls[i]);
            System.out.println((i + 1) + ". " + urls[i] + " -> Domain: " + domain);
        }

        scanner.close();
    }
    public static String extractDomain(String url) {
        String result = url;
        int protocolIndex = result.indexOf("://");
        if (protocolIndex != -1) {
            result = result.substring(protocolIndex + 3);
        }
        if (result.startsWith("www.")) {
            result = result.substring(4);
        }
        int firstSlash = result.indexOf('/');
        int firstColon = result.indexOf(':');
        int firstQuestion = result.indexOf('?');
        int end = result.length();
        if (firstSlash != -1) end = Math.min(end, firstSlash);
        if (firstColon != -1) end = Math.min(end, firstColon);
        if (firstQuestion != -1) end = Math.min(end, firstQuestion);

        return result.substring(0, end);
    }
}