import java.util.Scanner;
public class loop8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double tot=0;
        double subtot=0;
        int quasum=0;
        for(int i=0;i<n;i++){
            String proname=sc.next();
            double upri=sc.nextDouble();
            int qua=sc.nextInt();
            quasum=quasum+qua;
            double bon=0;
            if(qua==1){
                bon=0;
            }
            else if(qua>1 && qua<=4){
                bon=10;
            }
            else if(qua>4 && qua<=9){
                bon=15;
            }
            else if(qua>=10){
                bon=20;
            }
            subtot=upri*qua*(1-(bon/100));
            tot=upri*qua;
            sum=sum+subtot;
            System.out.println("Product : "+proname);
            System.out.println("Unit price : $"+upri);
            System.out.println("Quantity : "+qua);
            System.out.println("Discount : "+bon+" %");
            System.out.println("Subtotal : $"+subtot);
        }
        double totdis=tot-sum;
        double savper=(totdis/tot)*100;
        System.out.println("Total items : "+quasum);
        System.out.println("Original Total : $"+tot);
        System.out.println("Total discount : "+totdis+"%");
        System.out.println("Final total : $"+sum);
        System.out.println("Savings : "+savper+"%");
        sc.close();
    }
}
