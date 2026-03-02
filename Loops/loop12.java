import java.util.Scanner;
public class loop12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double avg=0;
        double sum=0;
        int count=0;
        double finfee=0;
        for(int i=1;i<=n;i++){
            String vehtype=sc.next();
            double hrspark=sc.nextDouble();
            int hrate=0;
            if(vehtype.equals("Car")){
                hrate=3;
            }
            else if(vehtype.equals("Motorcycle")){
                hrate=2;
            }
            else if(vehtype.equals("Truck")){
                hrate=5;
            }
            else if(vehtype.equals("Bus")){
                hrate=7;
            }
            double fee=hrspark*hrate;
            sum=sum+hrate*hrspark;
            double cap=0;
            if(vehtype.equals("Car")){
                cap=30;
            }
            else if(vehtype.equals("Motorcycle")){
                cap=20;
            }
            else if(vehtype.equals("Truck")){
                cap=60;
            }
            else if(vehtype.equals("Bus")){
                cap=100;
            }
            String status="";
            if(fee<cap){
                finfee=fee;
                status="No";
            }
            else{
                finfee=cap;
                status="Yes";
            }
            if(hrspark>8){
                count++;
            }
            System.out.println("Vehicle "+i+"type : "+vehtype);
            System.out.println("Hours parked : "+hrspark);
            System.out.println("Hourly rate : $"+hrate);
            System.out.println("Parking fee : $"+fee);
            System.out.println("Cap applied : "+status);
        }
        avg=sum/n;
        System.out.println("Total vehicles : "+n);
        System.out.println("Total revenue : $"+sum);
        System.out.printf("Average fee : $%.2f",avg);
        System.out.println("\nPeak hours vehicle (>8 hours) : "+count);
        sc.close();
    }
}

