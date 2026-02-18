import java.util.Scanner;
public class pro7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hrate=sc.nextInt();
        String bp=sc.next();
        double temp=sc.nextDouble();
        String sym=sc.next();
        String[]parts=bp.split("/");
        int sys=Integer.parseInt(parts[0]);
        int dia=Integer.parseInt(parts[1]);
        String name="";
        int time=0;
        String action="";
        if(hrate<50 || hrate>130 || sys>180 || sys<90 ||temp>103||temp<96){
            if(sym.equals("Life-threatening")){
                name="Critical";
                time=0;
                action="Immediate emergency care";
            }
        }
        else if((hrate>=50 && hrate<=60) ||(hrate>=110 && hrate<=130) ){
            if((sys>=160 && sys<=180) || (sys>=90 && sys<=100)){
                if((temp>=101 && temp<=103) || (temp>=96 && temp<=97)){
                    if(sym.equals("Severe")){
                        name="Urgent";
                        time=20;
                        action="Priority medical Attention";
                    }
                }
            }
        }
        else if(sym.equals("Moderate")){
            name="Standard";
            time=45;
            action="Standard examination";
        }
        else{
            name="Non-urgent";
            time=90;
            action="Routine checkup";
        }

        System.out.println("Heartrate : "+hrate);
        System.out.println("Blood pressure : "+bp);
        System.out.println("Temperature : "+temp);
        System.out.println("Symptom severity : "+sym);
        System.out.println("Triage Priority :"+name);
        System.out.println("Estimated wait time : "+time);
        System.out.println("Recommended Action : "+action);
        sc.close();
    }
}