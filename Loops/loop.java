import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pramt=sc.nextInt();
        int rate=sc.nextInt();
        int years=sc.nextInt();
        double avg=(1+rate*0.01);
        double cmint=0;
        double pow=1;
        for(int i=1;i<=years;i++){
            pow=pow*avg;
            for(int j=1;j<=years;j++){
                cmint=pramt*pow;
            }
            System.out.printf("%.2f\n",cmint);
        }
        sc.close();
    }
}