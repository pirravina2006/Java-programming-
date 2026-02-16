import java.util.Scanner;

public class problem21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maint=sc.nextInt();
        int park=sc.nextInt();
        int hall=sc.nextInt();
        int sec=sc.nextInt();
        int elec=sc.nextInt();
        int cle=sc.nextInt();
        hall=hall+park+maint;
        cle=hall-sec-elec-cle;
        System.out.println(cle);
        sc.close();
    }
}
