import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int rate=sc.nextInt();
        int des=sc.nextInt();
        int tes=sc.nextInt();
        int adv=sc.nextInt();
        tes=tes+des+(hour*rate);
        adv=tes-adv;
        System.out.println(adv);
        sc.close();
    }
}
