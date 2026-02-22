import java.util.Scanner;
public class loop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double occ=0;
        String status="";
        double sum=0;
        double max=0;
        int count=0;
        for(int i=1;i<=n;i++){
            int days=sc.nextInt();
            int roc=sc.nextInt();
            int trooms=sc.nextInt();
            occ=(roc/trooms)*100;
            if(occ<60){
                status="Low";
            }
            else if(occ>=60 && occ<=79){
                status="Moderate";
            }
            else if(occ>=80 && occ<=99){
                status="High";
            }
            else if(occ==100){
                status="Full";
                count++;
            }
            sum=sum+occ;
            System.out.println("Days : "+days);
            System.out.println("Rooms occupied : "+roc);
            System.out.println("Total rooms : "+trooms);
            System.out.println("Occupancy rate : "+occ);
            System.out.println("Status : "+status);
        }
        if(occ>max){
            max=occ;
        }
        double avg=sum/n;
        System.out.println("Total days Analyzed : "+n);
        System.out.println("Average occupancy rate  :"+avg);
        System.out.println("Peak occupancy day : "+max);
        System.out.println("Days at full capacity : "+count);
        sc.close();
    }
}
