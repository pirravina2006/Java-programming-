import java.util.Scanner;
public class pro14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String memtier=sc.next();
        int conmon=sc.nextInt();
        String acclel=sc.next();
        String addson=sc.next();
        double basemonfee=0;
        if(memtier.equals("Basic")){
            basemonfee=40;
        }
        else if(memtier.equals("Premium")){
            basemonfee=80;
        }
        else if(memtier.equals("Elite")){
            basemonfee=120;
        }
        else if(memtier.equals("VIP")){
            basemonfee=150;
        }
        double condis=0;
        if(conmon==1){
            condis=0;
        }
        else if(conmon==6){
            condis=10;
        }
        else if(condis==12){
            condis=15;
        }
        else{
            condis=25;
        }
        double accfee=0;
        if(acclel.equals("Single-location")){
            accfee=0;
        }
        else if(acclel.equals("Regional")){
            accfee=20;
        }
        else{
            accfee=50;
        }
        double addonfee=0;
        if(addson.equals("None")){
            addonfee=0;
        }
        else if(addson.equals("Personal-training")){
            addonfee=100;
        }
        else if(addson.equals("Classes")){
            addonfee=50;
        }
        else{
            addonfee=200;
        }
        double disfee=basemonfee*(1-condis/100);
        double montot=disfee+disfee+accfee;
        double contot=montot*conmon;
        double savings=(basemonfee+accfee+addonfee)*(conmon-contot);
        System.out.println("Membership tier : "+memtier);
        System.out.println("Contract length : "+conmon);
        System.out.println("Access Level : "+acclel);
        System.out.println("Adds on : "+addson);
        System.out.println("Base monthly fee : "+basemonfee);
        System.out.println("Contract discount : "+condis);
        System.out.println("Access fee : "+accfee);
        System.out.println("Adds-on fee : "+addonfee);
        System.out.println("Monthly total : "+montot);
        System.out.println("Contract total : "+contot);
        System.out.println("Savings vs Month-to-Month : "+savings);
        sc.close();
    }
}