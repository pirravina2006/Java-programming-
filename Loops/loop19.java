import java.util.Scanner;
public class loop19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int exp=0;
        int expsoon=0;
        int act=0;
        for(int i=1;i<=n;i++){
            String proID=sc.next();
            String protype=sc.next();
            int month=sc.nextInt();
            int warper=0;
            if(protype.equals("Electronics")){
                warper=12;
            }
            else if(protype.equals("Appliance")){
                warper=24;
            }
            else if(protype.equals("Computer")){
                warper=36;
            }
            int rem=warper-month;
            if(rem<0){
                rem=0;
            }
            String status="";
            if(rem<0 || rem==0){
                status="Expired";
                exp++;
            }
            else if(rem>=1 && rem<=3){
                status="Expiring soon";
                expsoon++;
            }
            else if(rem>3){
                status="Active";
                act++;
            }
            System.out.println("Product ID : "+proID);
            System.out.println("Type :"+protype);
            System.out.println("Warranty period : "+warper+" months");
            System.out.println("Months used : "+month);
            System.out.println("Remaining months : "+rem+" months");
            System.out.println("Status : "+status);
        }
        System.out.println("Total products : "+n);
        System.out.println("Active warranties : "+act);
        System.out.println("Expiring soon : "+expsoon);
        System.out.println("Expired warranties : "+exp);
        sc.close();
    }
}
