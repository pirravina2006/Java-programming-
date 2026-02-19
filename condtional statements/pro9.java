import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rev=sc.nextDouble();
        String type=sc.next();
        double exp=sc.nextDouble();
        double taxcre=sc.nextDouble();
        double taxinc=rev-exp;
        double taxrate=0;
        if(type.equals("C-corp")){
            if(taxinc<=500000){
                taxrate=21;
            }
            else if(taxinc>500000 && taxinc<=1000000){
                taxrate=24;
            }
            else if(taxinc>1000000 && taxinc<=2000000){
                taxrate=28;
            }
            else if(taxinc>2000000){
                taxrate=30;
            }
        }
        else if(type.equals("S-corp")){
            if(taxinc<=500000){
                taxrate=20;
            }
            else if(taxinc>500000 && taxinc<=1000000){
                taxrate=25;
            }
            else if(taxinc>1000000){
                taxrate=28;
            }
        }
        else if(type.equals("LLC")){
            if(taxinc<=200000){
                taxrate=15;
            }
            else if(taxinc>200000 && taxinc<=500000){
                taxrate=18;
            }
            else if(taxinc>500000){
                taxrate=22;
            }
        }
        else if(type.equals("Partnership")){
            if(taxinc<=300000){
                taxrate=18;
            }
            else if(taxinc>300000 && taxinc<=800000){
                taxrate=22;
            }
            else if(taxinc>800000){
                taxrate=26;
            }
        }
        double grosstax=taxinc*(taxrate/100);
        double nettax;
        if(taxcre>=0){
            nettax=grosstax-taxcre;
        }
        else{
            nettax=0;
        }
        double netrate=(nettax/rev)*100;
        System.out.println("Annual Revenue : $"+rev);
        System.out.println("Business type : "+type);
        System.out.println("Deductible Expenses : $"+exp);
        System.out.println("Tax credits : $"+taxcre);
        System.out.println("Taxable income : $"+taxinc);
        System.out.println("Tax rate : "+taxrate +" %");
        System.out.println("Gross Tax : $"+grosstax);
        System.out.println("Net Tax after credits : $"+nettax);
        System.out.println("Effective tax rate : "+netrate +"%");
        sc.close();
    }
}
