import java.util.Scanner;

public class pro15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int usercount=sc.nextInt();
        String lictype=sc.next();
        String supplel=sc.next();
        int conyears=sc.nextInt();
        double base=0;
        if(lictype.equals("Standard")){
            base=60;
        }
        else if(lictype.equals("Professional")){
            base=120;
        }
        else if(lictype.equals("Enterprise")){
            base=200;
        }
        double voldis=0;
        if(usercount>=1 && usercount<=50){
            voldis=0;
        }
        else if(usercount>=51 && usercount<=200){
            voldis=15;
        }
        else if(usercount>=201 && usercount<=500){
            voldis=20;
        }
        else if(usercount>=501 && usercount<=1000){
            voldis=25;
        }
        else if(usercount>1000){
            voldis=35;
        }
        double supportfee=0;
        if(supplel.equals("Basic")){
            supportfee=10;
        }
        else if(supplel.equals("Priority")){
            supportfee=30;
        }
        else if(supplel.equals("Premium")){
            supportfee=80;
        }
        double multidis=0;
        if(conyears==1){
            multidis=0;
        }
        else if(conyears==2){
            multidis=5;
        }
        else if(conyears==3){
            multidis=10;
        }
        else if(conyears==5){
            multidis=20;
        }
        double discounted=base*(1-voldis/100);
        double anperuser=(discounted+supportfee)*(1-multidis/100);
        double totann=anperuser*usercount;
        double contval=totann*conyears;
        String pricing="";
        if(usercount<=200){
            pricing="Small business";
        }
        else if(usercount>200 && usercount<=1000){
            pricing="Mid market";
        }
        else if(usercount>1000){
            pricing="Enterprise";
        }
        System.out.println("User count : "+usercount);
        System.out.println("License type : "+lictype);
        System.out.println("Support level : "+supplel);
        System.out.println("Contract duration : "+conyears);
        System.out.println("Base price per user : $"+base);
        System.out.println("Volume discount : "+voldis +" %");
        System.out.println("Support fee per user : $"+supportfee);
        System.out.println("Multiyear Discount : "+multidis +" %");
        System.out.println("Annual cost per user : $"+anperuser);
        System.out.println("Total annual cost : $"+totann);
        System.out.println("Total contract value : $"+contval);
        System.out.println("Pricing tier : "+pricing);
        sc.close();
    }
}
