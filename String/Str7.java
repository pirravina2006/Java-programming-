import java.util.Scanner;
import java.lang.String;
public class Str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Flight Details:");
        for (int i = 1; i <= n; i++) {
            String flightCode = sc.nextLine();
            String[] parts = flightCode.split("-");
            
            if (parts.length == 3) {
                String firstPart = parts[0];
                String origin = parts[1];
                String destination = parts[2];
                String airline = firstPart.replaceAll("[^A-Za-z]", "");
                String flightNum = firstPart.replaceAll("[^0-9]", "");

                System.out.printf("%d. Airline: %s, Flight: %s, From: %s, To: %s%n",
                i, airline, flightNum, origin, destination);
            }
        }
        sc.close();
    }
}