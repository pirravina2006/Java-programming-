import java.util.Scanner;

public class problem22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int copy=sc.nextInt();
        int cost=sc.nextInt();
        int edit=sc.nextInt();
        int des=sc.nextInt();
        int com=sc.nextInt();
        int mar=sc.nextInt();
        des=des+edit+(copy*cost);
        mar=des-com-mar;
        System.out.println(mar);
        sc.close();
    }
}
