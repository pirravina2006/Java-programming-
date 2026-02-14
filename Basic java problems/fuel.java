import java.util.Scanner;
public class fuel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dis=sc.nextInt();
        int mileage=sc.nextInt();
        int fuel_price=sc.nextInt();
        int tot=sc.nextInt();
        int div=dis/mileage;
        fuel_price=fuel_price*div;
        tot=tot+fuel_price;
        System.out.println(tot);
    }
}
