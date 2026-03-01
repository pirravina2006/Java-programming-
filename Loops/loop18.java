import java.util.Scanner;
public class loop18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double avg=0;
        int tem2=0;
        int tem3=0;
        double high=0;
        double low=0;
        int hot=0;
        int cold=0;
        for(int i=1;i<=n;i++){
            int hour=sc.nextInt();
            double tem=sc.nextDouble();
            String status="";
            if(tem>40 || tem<0){
                status="Extreme";
            }
            else if(tem>=32 && tem<=40){
                status="Hot";
                hot++;
            }
            else if(tem>=0 && tem<=10){
                status="cold";
                cold++;
            }
            else if(tem>10 && tem<32){
                status="Normal";
            }
            if(tem>high){
                high=tem;
                tem2=hour;
            }
            if(tem<low){
                low=tem;
                tem3=hour;
            }
            sum=sum+tem;
            System.out.println("Hours "+hour+" : "+tem+"C");
            System.out.println("Status : "+status);
        }
        avg=sum/n;
        System.out.println("Total readings : "+n);
        System.out.printf("Average temperature : %.2f",avg);
        System.out.println("\n");
        System.out.println("Highest temperature : "+high+"C at hour "+tem2);
        System.out.println("Lowest temperature : "+low+"C at hour "+tem3);
        System.out.println("Hot hours : "+hot);
        System.out.println("Cold hours : "+cold);
        sc.close();
    }
}
