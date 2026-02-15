import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        int ses=sc.nextInt();
        int pay=sc.nextInt();
        int bonus=sc.nextInt();
        int maint=sc.nextInt();
        bonus=bonus+sal+(ses*pay);
        maint=bonus-maint;
        System.out.println(maint);
        sc.close();
    }
}
