import java.util.Scanner;
public class factory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rod=sc.nextInt();
        int hour=sc.nextInt();
        int overtime=sc.nextInt();
        int rejected=sc.nextInt();
        rod=rod*hour;
        overtime=overtime+rod;
        rejected=overtime-rejected;
        System.out.println(rejected);
        sc.close();
    }
}
