import java.util.Scanner;

public class problem25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int resu=sc.nextInt();
        int resr=sc.nextInt();
        int comu=sc.nextInt();
        int comr=sc.nextInt();
        int con=sc.nextInt();
        int pen=sc.nextInt();
        int maint=sc.nextInt();
        int tre=sc.nextInt();
        int net=(resu*resr)+(comu*comr)+con+pen;
        tre=net-maint-tre;
        System.out.println(tre);
        sc.close();
    }
}
