import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tier=sc.next();
        double value=sc.nextDouble();
        String cate=sc.next();
        String status=sc.next();
        double base=0;
        double dis=0;
        if(tier.equals("Bronze")){
            base=5;
        }
        else if(tier.equals("Silver")){
            base=8;
        }
        else if(tier.equals("Gold")){
            base=12;
        }
        else if(tier.equals("Platinum")){
            base=15;
        }
        if(value>=500 && value<=999){
            dis=dis+3;
        }
        else if(value>=1000 && value<=1999){
            dis=dis+5;
        }
        else if(value>=2000){
            dis=dis+7;
        }
        if((cate.equals("Electronics") || cate.equals("Books")) && status.equals("Prime")){
            dis=dis+5;
        }
        else if((cate.equals("Fashion")) && ((status.equals("Prime")) || (status.equals("Regular")))){
            dis=dis+3;
        }
        else if(cate.equals("Groceries") && value>300){
            dis=dis+2;
        }
        double tot=base+dis;
        double saving=value*(tot/100);
        double price=value-saving;
        System.out.println("Loyalty tier : "+tier);
        System.out.println("Cart value: $"+value);
        System.out.println("Product Category : "+cate);
        System.out.println("Membership : "+status);
        System.out.println("Base Discount : "+base+"%");
        System.out.println("Additional Discount : "+dis+"%");
        System.out.println("Total discount : "+tot+"%");
        System.out.println("Final price : $"+price);
        System.out.println("Savings : $"+saving);
        sc.close();
    }
}
