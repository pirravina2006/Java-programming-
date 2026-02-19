import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String timeofday=sc.next();
        double powercons=sc.nextDouble();
        double renper=sc.nextDouble();
        String tier=sc.next();
        double base=0;
        if(tier.equals("Basic")){
            base=0.18;
        }
        else if(tier.equals("Time-of-use")){
            base=0.15;
        }
        else if(tier.equals("Premium-Green")){
            base=0.12;
        }
        double ratemul=0;
        if(timeofday.equals("Peak")){
            ratemul=1.8;
        }
        else if(timeofday.equals("Off-peak")){
            ratemul=1.0;
        }
        else{
            ratemul=0.6;
        }
        double rencre=(powercons*renper/100 )* base;
        double cost=(powercons*base*ratemul)-rencre;
        System.out.println("Time of the day : "+timeofday);
        System.out.println("Power consumption : "+powercons+"kWh");
        System.out.println("Renewable energy : "+renper+"%");
        System.out.println("Rate tier : "+tier);
        System.out.println("Base rate : $"+base);
        System.out.println("Rate multiplier : "+ratemul+"x");
        System.out.println("Renewable credit : $"+rencre);
        System.out.println("Total cost : $"+cost);
        sc.close();
    }
}
