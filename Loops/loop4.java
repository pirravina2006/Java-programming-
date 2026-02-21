import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double comi=0;
        String rep="";
        double high=0;
        for(int i=1;i<=n;i++){
            String repname=sc.next();
            double slamt=sc.nextDouble();
            double comrate=0;
            if(slamt>0 && slamt<=40000){
                comrate=5;
            }
            else if(slamt>40000 && slamt<=80000){
                comrate=8;
            }
            else if(slamt>80000 && slamt<=100000){
                comrate=10;
            }
            else if(slamt>100000 && slamt<150000){
                comrate=12;
            }
            else if(slamt>=150000){
                comrate=15;
            }
            double com=slamt*(comrate/100);
            double bon=0;
            if(slamt>=100000){
                bon=2000;
            }
            else if(slamt>=150000){
                bon=3000;
            }
            sum=sum+slamt;
            comi=comi+com;
            if(slamt>high){
                high=slamt;
                rep=repname;
            }
            System.out.println("Sales Rep : "+repname);
            System.out.println("Sales Amount : $"+slamt);
            System.out.println("Commision rate : "+comrate+"%");
            System.out.println("Commision Earned : $"+com);
            System.out.println("Bonus : $"+bon);
            double tot=com+bon;
            System.out.println("Total Payout : $"+tot);
        }
        System.out.println("\n");
        System.out.println("Total sales rep : "+n);
        System.out.println("Total sales Amount : $"+sum);
        System.out.println("Total commission : $"+comi);
        System.out.println("Top performer : "+rep);
        sc.close();
    }
}
