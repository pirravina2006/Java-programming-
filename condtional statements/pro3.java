import java.util.Scanner;
public class pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int age=sc.nextInt();
        String smostatus=sc.next();
        String precon=sc.next();
        String covtier=sc.next();
        String agegroup="";
        if(age>=18 && age<=30){
            agegroup="Young";
        }
        else if(age>=31 && age<=50){
            agegroup="Middle";
        }
        else if(age>=51 && age<=65){
            agegroup="Senior";
        }
        else if(age>=66 && age<=100){
            agegroup="Elderly";
        }
        double basepre=0;
        if(covtier.equals("Basic")){
            if(agegroup.equals("Young")){
                basepre=200;
            }
            else if(agegroup.equals("Middle")){
                basepre=250;
            }
            else if(agegroup.equals("Senior")){
                basepre=350;
            }
            else if(agegroup.equals("Elderly")){
                basepre=400;
            }
        }
        else if(covtier.equals("Standard")){
            if(agegroup.equals("Young")){
                basepre=300;
            }
            else if(agegroup.equals("Middle")){
                basepre=350;
            }
            else if(agegroup.equals("Senior")){
                basepre=450;
            }
            else if(agegroup.equals("Elderly")){
                basepre=550;
            }
        }
        else if(covtier.equals("Premium")){
            if(agegroup.equals("Young")){
                basepre=500;
            }
            else if(agegroup.equals("Middle")){
                basepre=600;
            }
            else if(agegroup.equals("Senior")){
                basepre=700;
            }
            else if(agegroup.equals("Elderly")){
                basepre=800;
            }
        }
        double surchg=0;
        if(smostatus.equals("Smoker")){
            surchg=40;
        }
        else if(smostatus.equals("Smoker") && precon.equals("Yes")){
            surchg=70;
        }
        else if(precon.equals("Yes") || precon.equals("No")){
            surchg=30;
        }
        double risk=basepre*(surchg/100);
        double tot=basepre+risk;
        System.out.println("Age : "+age);
        System.out.println("Smoking status : "+smostatus);
        System.out.println("Pre-existing condition : "+precon);
        System.out.println("Coverage Tier : "+covtier);
        System.out.println("Base premium : $"+basepre);
        System.out.println("Risk surcharge : $"+risk);
        System.out.println("Total premium : $"+tot);
        sc.close();
    }
}
