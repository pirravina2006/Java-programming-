import java.util.Scanner;
public class loop13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        for(int i=1;i<=n;i++){
            String doname=sc.next();
            int age=sc.nextInt();
            double weight=sc.nextDouble();
            double hemo=sc.nextDouble();
            String sts="";
            if((age>=18 && age<=65) && (weight>=50) && (hemo>=12.5)){
                sts="Eligible";
                count1++;
                System.out.println("Donor : "+doname);
                System.out.println("Age : "+age);
                System.out.println("Weight : "+weight);
                System.out.println("Hemoglobin : "+hemo+" g/DL");
                System.out.println("Eligibility : "+sts);
            }
            else{
                sts="Not eligible";
                count2++;
                System.out.println("Donor : "+doname);
                System.out.println("Age : "+age);
                System.out.println("Weight : "+weight);
                System.out.println("Hemoglobin : "+hemo+" g/DL");
                System.out.println("Eligibility : "+sts);
                System.out.println("Reason : Hemoglobin is below 12.5g/DL");
            }
        }
        double rate=(count1/n)*100;
        System.out.println("Total Donors : "+n);
        System.out.println("Eligible donors : "+count1);
        System.out.println("Rejected donors : "+count2);
        System.out.printf("Eligibility rate : %.2f",rate," %");
        sc.close();
    }
}
