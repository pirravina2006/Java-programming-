import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        int l=0;
        int c=0;
        double rq=0;
        for(int i=1;i<=n;i++){
            String proname=sc.next();
            int cust=sc.nextInt();
            int minst=sc.nextInt();
            String status="";
            if(cust>=minst){
                status="Adequate";
            }
            else if(cust<minst && cust>=minst/2){
                status="Low-stock";
                l++;
            }
            else if(cust<minst/2){
                status="Critical";
                c++;
            }
            if(status.equals("Adequate")){
                rq=0;
            }
            else if(status.equals("Low-stock")){
                rq=(minst-cust)+minst/2;
            }
            else if(status.equals("Critical")){
                rq=(minst-cust)+minst*1.5;
            }
            System.out.println("Product name : "+proname);
            System.out.println("Current stock : "+cust);
            System.out.println("Minimum stock : "+minst);
            System.out.println("Status : "+status);
            System.out.printf("Reorder Quantity : %.0f",rq);
            System.out.println("\n");
            sum=sum+rq;
        }
        System.out.println("Total product : "+n);
        System.out.println("Low stock Systems :"+l);
        System.out.println("Critical items : "+c);
        System.out.printf("Total reordered quantity : %.0f",sum);
        sc.close();
    }
}