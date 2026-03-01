import java.util.*;
public class loop15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double dis=0;
        double rev=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            double diskm=sc.nextDouble();
            String time=sc.next();
            double base=3.0;
            double dischg=diskm*1.0;
            double timesur=0;
            if(time.equals("Morning") || time.equals("Afternoon")){
                timesur=0;
            }
            else if(time.equals("Evening")){
                timesur=3;
            }
            else if(time.equals("Night")){
                timesur=5;
            }
            dis=dis+diskm;
            double fare=dischg+timesur+base;
            System.out.println("Ride "+i);
            System.out.println("Distance : "+diskm+" km");
            System.out.println("Time : "+time);
            System.out.println("Base fare : $"+base);
            System.out.println("Distance charge : $"+dischg);
            System.out.println("Time surcharge : $"+timesur);
            System.out.println("Total fare : $"+fare);
            rev=rev+fare;
        }
        avg=rev/n;
        System.out.println("Total distance : "+dis+" km");
        System.out.println("Total revenue : $"+rev);
        System.out.println("Average fare : $"+avg);
        sc.close();
    }
}
