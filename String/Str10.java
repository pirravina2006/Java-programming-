import java.util.Scanner;
import java.lang.String;
public class Str10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Masked Data:");
        for (int i = 1; i <= n; i++) {
            String cardNumber = sc.nextLine();
            String masked = maskCard(cardNumber);
            System.out.println(i + ". " + masked);
        }
        sc.close();
    }
    public static String maskCard(String card) {
        if (card.length() <= 4) {
            return card;
        }
        String lastFour = card.substring(card.length() - 4);
        int maskLength = card.length() - 4;
        StringBuilder maskedPart = new StringBuilder();
        for (int i = 0; i < maskLength; i++) {
            char currentChar = card.charAt(i);
            if (currentChar == '-' || currentChar == ' ') {
                maskedPart.append(currentChar);
            } else {
                maskedPart.append("*");
            }
        }
        return maskedPart.toString() + lastFour;
    }
}