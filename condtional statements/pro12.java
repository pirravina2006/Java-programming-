import java.util.Scanner;
public class pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String type=sc.next();
        String record=sc.next();
        String covlevel=sc.next();
        double basepre=0;
        if(covlevel.equals("Basic")){
            basepre=500;
        }
        else if(covlevel.equals("Standard")){
            basepre=800;
        }
        else if(covlevel.equals("Comphrehensive")){
            basepre=1500;
        }
        double multi=0;
        if(age>=16 && age<=21){
            multi=1.8;
        }
        else if(age>=22 && age<=25){
            multi=1.5;
        }
        else if(age>=26 && age<=40){
            multi=1.0;
        }
        else if(age>=41 && age<=60){
            multi=0.9;
        }
        else{
            multi=1.1;
        }
        double riskf=0;
        if(type.equals("Sedan")){
            riskf=1.0;
        }
        else if(type.equals("SUV")){
            riskf=1.2;
        }
        else if(type.equals("Sports")){
            riskf=1.5;
        }
        else if(type.equals("Truck")){
            riskf=1.1;
        }
        double recadj=0;
        if(record.equals("Clean")){
            recadj=-10;
        }
        else if(record.equals("Minor-violations")){
            recadj=25;
        }
        else if(record.equals("Major-violations")){
            recadj=50;
        }
        double adjpre=basepre*multi*riskf;
        double finpre=adjpre*(1+recadj/100);
        double monpre=finpre/12;
        System.out.println("Driver Age : "+age);
        System.out.println("Vehicle type : "+type);
        System.out.println("Driving record : "+record);
        System.out.println("Coverage level : "+covlevel);
        System.out.println("Base premium : $"+basepre);
        System.out.println("Age factor : "+multi+" x");
        System.out.println("Vehicle Risk factor : "+riskf +" x");
        System.out.println("Record Adjustment : "+recadj+" %");
        System.out.println("Monthly Premium : $"+monpre);
        System.out.println("Annual Premium : $"+finpre);
        if(multi>=1.5 && riskf>=1.5){
            System.out.println("Risk category : Very High");
        }
        else if(multi>1.0 || riskf>1.0){
            System.out.println("Risk category : High");
        }
        else if(multi>=1.0 && multi>=1.0){
            System.out.println("Risk category : Medium");
        }
        else{
            System.out.println("Risk category : Low");
        }
        sc.close();
    }
}
