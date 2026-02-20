import java.util.Scanner;
public class pro21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String loczone=sc.next();
        double parhrs=sc.nextDouble();
        String vehtype=sc.next();
        String memsts=sc.next();
        double basehsrate=0;
        if(loczone.equals("Downtown") ||loczone.equals("Businees-District") ||loczone.equals("Residential") ||loczone.equals("Airport")){
            basehsrate=5;
        }
        double zonepre=0;
        if(loczone.equals("Downtown")){
            zonepre=50;
        }
        else if(loczone.equals("Business-District")){
            zonepre=30;
        }
        else if(loczone.equals("Residential")){
            zonepre=0;
        }
        else if(loczone.equals("Airport")){
            zonepre=100;
        }
        double vesur=0;
        if(vehtype.equals("Motorcycle")){
            vesur=-2;
        }
        else if(vehtype.equals("Compact") || vehtype.equals("Sedan")){
            vesur=0;
        }
        else if(vehtype.equals("SUV")){
            vesur=3;
        }
        else if(vehtype.equals("Oversized")){
            vesur=5;
        }
        double rawfee=(basehsrate*(1+(zonepre/100))+vesur)*parhrs;
        double memdis=0;
        if(memsts.equals("None")){
            memdis=0;
        }
        else if(memsts.equals("Monthly")){
            memdis=20;
        }
        else if(memsts.equals("Annual")){
            memdis=25;
        }
        else if(memsts.equals("VIP")){
            memdis=30;
        }
        double daicap=0;
        double finfee=0;
        if(parhrs>=24){
            if(loczone.equals("Downtown")){
                daicap=150;
            }
            else if(loczone.equals("Business-District")){
                daicap=120;
            }
            else if(loczone.equals("Residential")){
                daicap=60;
            }
            else if(loczone.equals("Airport")){
                daicap=180;
            }
        }
        finfee=rawfee*(1-(memdis/100));
        String dcap="";
        if(parhrs>=24){
            dcap="Yes";
        }
        else{
            dcap="No";
        }
        String ratecat="";
        if(loczone.equals("Downtown")||loczone.equals("Business-District")){
            ratecat="Premium";
        }
        else if(loczone.equals("Residential")){
            ratecat="Standard";
        }
        else{
            ratecat="Luxury";
        }
        System.out.println("Location Zone : "+loczone);
        System.out.println("Parking duration : "+parhrs);
        System.out.println("Vehicle type : "+vehtype);
        System.out.println("Membership Status : "+memsts);
        System.out.println("Based Hourly rate : "+basehsrate);
        System.out.println("Zone premium : "+zonepre);
        System.out.println("Vehicle Size surcharge : "+vesur);
        System.out.println("Membership discount : "+memdis);
        System.out.println("Total parking fee : "+finfee);
        System.out.println("Daily cap Applied : "+dcap);
        System.out.println("Rate category : "+ratecat);
        sc.close();
    }
}