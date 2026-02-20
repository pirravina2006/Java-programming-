import java.util.Scanner;
public class pro19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String movform=sc.next();
        String showtime=sc.next();
        String seatcat=sc.next();
        String custype=sc.next();
        double basepri=0;
        if(movform.equals("2D") || movform.equals("3D") || movform.equals("IMAX") || movform.equals("4DX")){
            basepri=12;
        }
        double formsur=0;
        if(movform.equals("2D")){
            formsur=0;
        }
        else if(movform.equals("3D")){
            formsur=5;
        }
        else if(movform.equals("IMAX")){
            formsur=8;
        }
        else if(movform.equals("4D")){
            formsur=10;
        }
        double supfee=0;
        if(seatcat.equals("Standard")){
            supfee=0;
        }
        else if(seatcat.equals("Premium")){
            supfee=4;
        }
        else if(seatcat.equals("Recliner")){
            supfee=7;
        }
        double tbadj=0;
        if(showtime.equals("Matinee")){
            tbadj=-30;
        }
        else if(showtime.equals("Evening")){
            tbadj=0;
        }
        else if(showtime.equals("Prime-time")){
            tbadj=20;
        }
        else if(showtime.equals("Late-night")){
            tbadj=-20;
        }
        double cusdis=0;
        if(custype.equals("Adult")){
            cusdis=0;
        }
        else if(custype.equals("Senior")){
            cusdis=25;
        }
        else if(custype.equals("Student")){
            cusdis=15;
        }
        else if(custype.equals("Child")){
            cusdis=30;
        }
        double bwsur=basepri+formsur+supfee;
        double adjpri=bwsur*(1+(tbadj/100));
        double finpri=adjpri*(1-(cusdis/100));
        System.out.println("Movie format : "+movform);
        System.out.println("Show time : "+showtime);
        System.out.println("Seat category : "+seatcat);
        System.out.println("Customer type : "+custype);
        System.out.println("Base ticket price : $"+basepri);
        System.out.println("Format surcharge : $"+formsur);
        System.out.println("Seat upgrade fee : $"+supfee);
        System.out.println("Time based- adjacement : "+tbadj+"%");
        System.out.println("Customer discount : "+cusdis+"%");
        System.out.printf("Final ticket price : %.1lf$"+finpri);
        String con="No";
        if(showtime.equals("Matinee")||(custype.equals("Senior")) || (custype.equals("Student")) ||(custype.equals("Child"))){
            con="Yes";
        }
        System.out.println("Concession voucher : "+con);
        String prcat="";
        if(finpri>=5 && finpri<=10){
            prcat="Value";
        }
        else if(finpri>10 && finpri<=15){
            prcat="Standard";
        }
        else if(finpri>15 && finpri<=30){
            prcat="Premium";
        }
        else if(finpri>30){
            prcat="Luxury";
        }
        System.out.println("Pricing category : "+prcat);
        sc.close();
    }
}
