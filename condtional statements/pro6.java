import java.util.Scanner;
public class pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bclass=sc.next();
        int days=sc.nextInt();
        double seat=sc.nextDouble();
        String type=sc.next();
        double amt=0;
        if(bclass.equals("Economy")){
            if(type.equals("Domestic")){
                amt=200;
            }
            else if(type.equals("Int-short")){
                amt=500;
            }
            else if(type.equals("Int-long")){
                amt=800;
            }
        }
        else if(bclass.equals("Business")){
            if(type.equals("Domestic")){
                amt=600;
            }
            else if(type.equals("Int-short")){
                amt=1500;
            }
            else if(type.equals("Int-long")){
                amt=2500;
            }
        }
        else if(bclass.equals("First")){
            if(type.equals("Domestic")){
                amt=1000;
            }
            else if(type.equals("Int-short")){
                amt=3000;
            }
            else if(type.equals("Int-long")){
                amt=5000;
            }
        }
        double demand=0;
        String name="";
        if(seat<30 && days<14){
            demand=1.8;
            name="High Demand";
        }
        else if(seat<50 && days<30){
            demand=1.5;
            name="High Demand";
        }
        else if(seat<60 || (days>=30 && days<60)){
            demand=1.0;
            name="Moderate";
        }
        else if(seat>=60 && days>60){
            demand=0.8;
            name="Low Demand";
        }
        double fi=demand*amt;
        System.out.println("Booking class : "+bclass);
        System.out.println("Days until Departure : "+days);
        System.out.println("Seat Availability : "+seat+"%");
        System.out.println("Route Type :"+type);
        System.out.println("Base Price : $"+amt);
        System.out.println("Demand Multiplier : "+demand +"x");
        System.out.println("Final Ticket Price : $"+fi);
        System.out.println("Pricing category : "+name);
        sc.close();
    }
}
