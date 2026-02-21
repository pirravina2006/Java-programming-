import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            String name=sc.next();
            double basal=sc.nextDouble();
            int perrat=sc.nextInt();
            double incper=0;
            if(perrat==5){
                incper=15;
            }
            else if(perrat==4){
                incper=10;
            }
            else if(perrat==3){
                incper=5;
            }
            else if(perrat==2){
                incper=2;
            }
            else{
                incper=0;
            }
            double finsal=basal*(1+incper/100);
            sum=sum+finsal;
            System.out.println("Employee : "+name);
            System.out.println("Base salary : $"+basal);
            System.out.println("Performance Rating : "+perrat);
            System.out.println("Increment : "+incper +"%");
            System.out.printf("Final salary : $%.2f",finsal);
            System.out.println("\n");
        }
        double avg=sum/n;
        System.out.println("Total employees processed : "+n);
        System.out.printf("Total payroll : $%.2f",sum);
        System.out.println("\n");
        System.out.printf("Average salary : $%.2f",avg);
        sc.close();
    }
}
