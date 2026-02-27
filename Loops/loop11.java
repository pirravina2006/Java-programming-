import java.util.Scanner;
public class loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double price=0;
        double finpri=0;
        double sum2=0;
        double sum3=0;
        for(int i=1;i<=n;i++){
            String seatype=sc.next();
            String custype=sc.next();
            double base=0;
            if(seatype.equals("Regular")){
                base=12;
            }
            else if(seatype.equals("Premium")){
                base=18;
            }
            else if(seatype.equals("Recliner")){
                base=25;
            }
            double dis=0;
            if(custype.equals("Adult")){
                dis=0;
            }
            else if(custype.equals("Child")){
                dis=30;
            }
            else if(custype.equals("Senior")){
                dis=25;
            }
            price=base*(dis/100);
            finpri=base-price;
            sum=sum+base;
            sum2=sum2+price;
            sum3=sum3+finpri;
            System.out.println("Ticket "+i+" : "+seatype+" - "+custype);
            System.out.println("Base price : $"+base);
            System.out.println("Discount : "+dis + " %");
            System.out.println("Final price : $"+finpri);
        }
        String app="";
        if(n>=5){
            app="Yes";
            double dis1=sum*0.10;
            double val=sum-dis1;
            System.out.println("Total tickets : "+n);
            System.out.println("original Total : $"+sum);
            System.out.println("Total discount : $"+dis1);
            System.out.println("Final total : $"+val);
            System.out.println("Group discount applied : "+app);
        }
        else{
            app="No";
            System.out.println("Total tickets : "+n);
            System.out.println("original Total : $"+sum);
            System.out.println("Total discount : $"+sum2);
            System.out.println("Final total : $"+sum3);
            System.out.println("Group discount applied : "+app);
        }
        sc.close();
    }
}
