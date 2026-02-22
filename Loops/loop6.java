import java.util.Scanner;
public class loop6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double inbal=sc.nextDouble();
        int n=sc.nextInt();
        int scount=0;
        int fcount=0;
        String rea="";
        double rem=0;
        double sum=0;
        for(int i=1;i<=n;i++){
            double withamt=sc.nextDouble();
            String status= "";
            if(withamt<=inbal){
                status="Yes";
                rem=inbal-withamt;
                sum=sum+rem;
                scount++;
            }
            else{
                status="Denied";
                rea="Insufficient fund";
                fcount++;
            }
            System.out.println("Transaction "+i+" : $"+withamt);
            if(status.equals("yes")){
                System.out.println("Remaining Balance : $"+rem);
            }
            else{
                System.out.println("Reason : "+rea);
                System.out.println("Remaining Balance : $"+rem);
            }
        }
        System.out.println("Total transactions : "+n);
        System.out.println("Sucessful withdrawals : "+scount);
        System.out.println("Failed withdrawals : "+fcount);
        System.out.println("Final balance : $"+rem);
        System.out.println("Total withdrawn : $"+sum);
        sc.close();
    }
}
