import java.util.Scanner;
public class loop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double subtot=0;
        double sum=0;
        for(int i=1;i<=n;i++){
            String itname=sc.next();
            double price=sc.nextDouble();
            int qua=sc.nextInt();
            subtot=price*qua;
            System.out.println("Item : "+itname);
            System.out.println("Price : $"+price+" x "+qua);
            System.out.println("Subtotal : $"+subtot);
            sum=sum+subtot;
        }
        double tax=sum*0.08;
        double serchr=sum*0.10;
        double grtot=subtot+tax+serchr;
        System.out.println("Total items : "+n);
        System.out.println("Subtotal : $"+sum);
        System.out.println("Tax (8%) : $"+tax);
        System.out.printf("Service charge : $%.2f",serchr);
        System.out.printf("Grand total : $%.2f",grtot);
        sc.close();
    }
}
