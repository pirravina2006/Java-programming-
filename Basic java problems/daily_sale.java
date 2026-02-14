import java.util.Scanner;
public class daily_sale {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int sales=sc.nextInt();
        int dis=sc.nextInt();
        int gst=sc.nextInt();
        float dis2=sales*dis/100;
        float tot=sales-dis2;
        float gst2=tot*gst/100;
        float sum=tot+gst2;
        System.out.println("%.2f"+sum);
    }
}
