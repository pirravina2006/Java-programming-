import java.util.Scanner;
public class loop17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cur=0;
        double sum=0;
        for(int i=1;i<=n;i++){
            String memname=sc.next();
            String memtype=sc.next();
            int due=sc.nextInt();
            double renfee=0;
            if(memtype.equals("Basic")){
                renfee=50;
            }
            else if(memtype.equals("Premium")){
                renfee=100;
            }
            else if(memtype.equals("VIP")){
                renfee=200;
            }
            double dis=0;
            if(due>=45){
                dis=20;
            }
            else if(due<=44 && due>=30){
                dis=15;
            }
            else if(due>=29 && due<=15){
                dis=10;
            }
            else{
                dis=0;
            }
            String priority="";
            if(due<10){
                priority="Urgent";
                cur++;
            }
            else if(due>=10 && due<=30){
                priority="High";
            }
            else if(due>30){
                priority="Normal";
            }
            double finfee=renfee*(1-dis/100);
            sum=sum+finfee;
            System.out.println(" \n");
            System.out.println("Member : "+memname);
            System.out.println("Membership : "+memtype);
            System.out.println("Days until expire : "+due);
            System.out.println("Renewable fee : $"+renfee);
            System.out.println("Discount : "+dis+" %");
            System.out.println("Final fee : $"+finfee);
            System.out.println("Priority : "+priority);
        }
        double avg=sum/n;
        System.out.println("Total members : "+n);
        System.out.println("Urgent renewals : "+cur);
        System.out.println("Total renewal revenue : $"+sum);
        System.out.println("Average revenue fee : $"+avg);
        sc.close();
    }
}
