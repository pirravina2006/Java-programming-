import java.util.Scanner;
import java.lang.String;
public class pro24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double dismiles=sc.nextDouble();
        double ordval=sc.nextDouble();
        String tislot=sc.next();
        String wecon=sc.next();
        double bdfee=3;
        double dissur=1*dismiles;
        double pesur=0;
        if(tislot.equals("Breakfast")){
            pesur=0;
        }
        else if(tislot.equals("Lunch")){
            pesur=2.50;
        }
        else if(tislot.equals("Dinner")){
            pesur=2.0;
        }
        else if(tislot.equals("Late-night")){
            pesur=1.50;
        }
        double weasur=0;
        if(wecon.equals("Clear")){
            weasur=0;
        }
        else if(wecon.equals("Rain")){
            weasur=2;
        }
        else if(wecon.equals("Snow")){
            weasur=3;
        }
        else if(wecon.equals("Strom")){
            weasur=5;
        }
        double orvaldis=0;
        if(ordval>=30 && ordval<=49.99){
            orvaldis=1;
        }
        else if(ordval>=50 && ordval<=74.99){
            orvaldis=3;
        }
        else if(ordval>=75){
            orvaldis=5;
        }
        double finfee=bdfee+dissur+pesur+weasur-ordval;
        System.out.println(finfee);
        sc.close();
    }
}
