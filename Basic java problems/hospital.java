import java.util.Scanner;
public class hospital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int charge=sc.nextInt();
        int days=sc.nextInt();
        int medcost=sc.nextInt();
        int labfee=sc.nextInt();
        int insur=sc.nextInt();
        charge=charge*days;
        labfee=medcost+labfee+charge;
        insur=labfee-insur;
        System.out.println(insur);
        sc.close();
    }
}
