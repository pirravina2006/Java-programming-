import java.util.Scanner;
public class pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String rocat=sc.next();
        String season=sc.next();
        int nbooks=sc.nextInt();
        String loytier=sc.next();
        double baserate=0;
        if(rocat.equals("Standard")){
            baserate=150;
        }
        else if(rocat.equals("Deluxe")){
            baserate=300;
        }
        else if(rocat.equals("Suite")){
            baserate=500;
        }
        else if(rocat.equals("Presidential")){
            baserate=1000;
        }
        double seamulti=0;
        if(season.equals("Off-peak")){
            seamulti=0.7;
        }
        else if(season.equals("Regular")){
            seamulti=1.0;
        }
        else if(season.equals("Peak")){
            seamulti=1.5;
        }
        else if(season.equals("Holiday")){
            seamulti=2.0;
        }
        double stdis=0;
        if(nbooks>=1 && nbooks<5){
            stdis=0;
        }
        else if(nbooks>=5 && nbooks<=7){
            stdis=5;
        }
        else if(nbooks>=8 && nbooks<=14){
            stdis=10;
        }
        else if(nbooks>=15){
            stdis=20;
        }
        double lodis=0;
        if(loytier.equals("None")){
            lodis=0;
        }
        else if(loytier.equals("Member")){
            lodis=10;
        }
        else if(loytier.equals("Gold")){
            lodis=15;
        }
        else if(loytier.equals("Platinum")){
            lodis=20;
        }
        double searat=baserate*seamulti;
        double disrate=searat*(1-(stdis/100))*(1-(lodis/100));
        double totcost=disrate*nbooks;
        System.out.println("Room category : "+rocat);
        System.out.println("Season : "+season);
        System.out.println("Nights booked : "+nbooks);
        System.out.println("Loyalty tier : "+loytier);
        System.out.println("Base rate per night : $"+baserate);
        System.out.println("Seasonal multiplier : "+seamulti+"x");
        System.out.println("Extended stay discount : "+stdis+" %");
        System.out.println("Loyalty discount : "+lodis+"%");
        System.out.println("Nightly rate : $"+disrate);
        System.out.println("Total booking cost : $"+totcost);
        sc.close();
    }
}
