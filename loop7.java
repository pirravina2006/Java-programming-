import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double rev=0;
        for(int i=0;i<n;i++){
            String conid=sc.next();
            int uncon=sc.nextInt();
            double bill=0;
            if(uncon>0 && uncon<=100){
                bill=0.10;
            }
            else if(uncon>100 && uncon<=200){
                bill=uncon*0.13;
            }
            else if(uncon>200 && uncon<=300){
                bill=uncon*0.16;
            }
            else{
                bill=uncon*0.20;
            }
            String cat="";
            if(uncon<=200){
                cat="Low usage";
            }
            else if(uncon>200 && uncon<=300){
                cat="Medium usage";
            }
            else{
                cat="High usage";
            }
            sum=sum+uncon;
            rev=rev+bill;
            System.out.println("Consumer ID : "+conid);
            System.out.println("Units consumed : "+uncon);
            System.out.println("Bill amount : $"+bill);
            System.out.println("Category : "+cat);
        }
        double avg=rev/n;
        System.out.println("Total consumers : "+n);
        System.out.println("Total units consumed : "+sum);
        System.out.println("Total revenue : $"+rev);
        System.out.println("Average bill : $"+avg);
        sc.close();
    }
}
