import java.util.Scanner;
public class mobiledata {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cost=sc.nextInt();
        int extraGb=sc.nextInt();
        int rateperGb=sc.nextInt();
        int tax=sc.nextInt();
        float tot=cost+(extraGb*rateperGb);
        float tax2=tot*tax/100;
        float res=tot+tax2;
        System.out.println(res);
    }
}
