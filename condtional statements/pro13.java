import java.util.Scanner;
public class pro13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String studentstatus=sc.next();
        int credithours=sc.nextInt();
        String protype=sc.next();
        String residency=sc.next();
        double basetuition=0;
        if(protype.equals("Undergraduate")){
            basetuition=350;
        }
        else if(protype.equals("Graduate")){
            basetuition=550;
        }
        else if(protype.equals("Professional")){
            basetuition=800;
        }
        double residencymulti=0;
        if(residency.equals("In-state")){
            residencymulti=1.0;
        }
        else if(residency.equals("Out-of-state")){
            residencymulti=2.5;
        }
        else if(residency.equals("International")){
            residencymulti=3.0;
        }
        double profee=0;
        if(studentstatus.equals("Full-time")){
            if(protype.equals("Undergraduate")){
                profee=500;
            }
            else if(protype.equals("Graduate")){
                profee=750;
            }
            else{
                profee=1200;
            }
        }
        else if(studentstatus.equals("Part-time")){
            if(protype.equals("Undergraduate")){
                profee=300;
            }
            else if(protype.equals("Graduate")){
                profee=750;
            }
            else{
                profee=900;
            }
        }
        else if(studentstatus.equals("Continuing-education")){
            if(protype.equals("Undergraduate")){
                profee=150;
            }
            else if(protype.equals("Graduate")){
                profee=150;
            }
            else{
                profee=150;
            }
        }
        double activityfee=0;
        if(studentstatus.equals("Full-time")){
            activityfee=200;
        }
        else if(studentstatus.equals("Part-time")){
            activityfee=100;
        }
        else if(studentstatus.equals("Continuing-education")){
            activityfee=50;
        }
        double tuitioncost=credithours*basetuition*residencymulti;
        double totfee=tuitioncost+profee+activityfee;
        String category="";
        if(studentstatus.equals("Full-time") && (residency.equals("In-state"))){
            category="Standard";
        }
        else if(studentstatus.equals("Continuing-education")){
            category="reduced";
        }
        else{
            category="Premium";
        }
        System.out.println("Student Status : "+studentstatus);
        System.out.println("Credit hours : "+credithours);
        System.out.println("Program type : "+protype);
        System.out.println("Residency : "+residency);
        System.out.println("Base Tuition Per Credit : $"+basetuition);
        System.out.println("Residency Multiplier : "+residencymulti+" x");
        System.out.println("Program fee : $"+profee);
        System.out.println("Student Activity fee : $"+activityfee);
        System.out.println("Total education fee : $"+totfee);
        System.out.println("Fee category : "+category);
        sc.close();
    }
}
