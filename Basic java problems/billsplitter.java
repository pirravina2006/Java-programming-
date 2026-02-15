import java.util.Scanner;
public class billsplitter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float bill=sc.nextFloat();
        float service=sc.nextFloat();
        float gst=sc.nextFloat();
        float people=sc.nextFloat();
        service=bill*service/100;
        gst=bill*gst/100;
        float tot=(service+gst+bill)/people;
        System.out.println(tot);
        sc.close();
    }
}
