import java.util.Scanner;
public class loop14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double count=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            String btype=sc.next();
            int dayslate=sc.nextInt();
            double finerate=0;
            if(btype.equals("Regular")){
                finerate=0.50;
            }
            else if(btype.equals("Reference")){
                finerate=1.0;
            }
            else if(btype.equals("Magazine")){
                finerate=0.25;
            }
            double fine=finerate*dayslate;
            double finecaps=0;
            if(btype.equals("Regular")){
                finecaps=10;
            }
            else if(btype.equals("Reference")){
                finecaps=20;
            }
            else if(btype.equals("Magazine")){
                finecaps=5;
            }
            double actfin=0;
            String sts="";
            if(fine<finecaps){
                actfin=fine;
                sts="No";
            }
            else{
                actfin=finecaps;
                sts="Yes";
            }
            if(dayslate>0){
                count++;
            }
            sum=sum+fine;
            System.out.println("Book "+i+":"+btype);
            System.out.println("Days late : "+dayslate);
            System.out.println("Daily fine : $"+finerate);
            System.out.println("Calculated fine : $"+fine);
            System.out.println("Actual fine : $"+actfin);
            System.out.println("Cap applied : "+sts);
        }
        avg=sum/n;
        System.out.println("Total Books : "+n);
        System.out.println("Total  Fines collected : $"+sum);
        System.out.println("Books overdue : "+count);
        System.out.printf("Average fine : $%.2f",avg);
        sc.close();
    }
}
