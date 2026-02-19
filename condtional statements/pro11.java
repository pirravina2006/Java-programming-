import java.util.Scanner;
public class pro11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        String status=sc.next();
        double orval=sc.nextDouble();
        String timeslot=sc.next();
        double base=0;
        if(status.equals("Gold")){
            base=15;
        }
        else if(status.equals("Silver")){
            base=10;
        }
        else if(status.equals("Bronze")){
            base=5;
        }
        double adj=0;
        if(timeslot.equals("Peak") || (timeslot.equals("Regular"))){
            adj=0;
        }
        else{
            adj=-5;
        }
        double totdis=adj+base;
        double serfee=0;
        if(type.equals("Delivery")){
            serfee=orval*(10/100);
        }
        else if(type.equals("Takeout")){
            serfee=orval*(3/100);
        }
        else if(type.equals("Dine-in")){
            serfee=orval*(0/100);
        }
        double disval=orval*(1-totdis/100);
        double finamt=disval+serfee;
        String priority="";
        if(timeslot.equals("Peak") && type.equals("Delivery")){
            priority="High";
        }
        else if(timeslot.equals("Regular")){
            priority="Medium";
        }
        else{
            priority="Low";
        }
        int preptime=0;
        if(type.equals("Delivery")){
            if(priority.equals("High")){
                preptime=30;
            }
            else if(priority.equals("Medium")){
                preptime=25;
            }
            else{
                preptime=20;
            }
        }
        else if(type.equals("Takeout")){
            if(priority.equals("High")){
                preptime=25;
            }
            else if(priority.equals("Medium")){
                preptime=20;
            }
            else{
                preptime=15;
            }
        }
        else if(type.equals("Dine-in")){
            if(priority.equals("High")){
                preptime=25;
            }
            else if(priority.equals("Medium")){
                preptime=20;
            }
            else{
                preptime=15;
            }
        }
        System.out.println("Order type : "+type);
        System.out.println("Loyalty status : "+status);
        System.out.println("Order value : $"+orval);
        System.out.println("Time slot : "+timeslot);
        System.out.println("Base discount : "+base +" %");
        System.out.println("Time based Adjustment : "+adj +" %");
        System.out.println("Service fee : $"+serfee);
        System.out.println("Final amount : $"+finamt);
        System.out.println("Kitchen priority : "+priority);
        System.out.println("Estimated prep time :"+preptime+" minutes");
        sc.close();
    }
}
