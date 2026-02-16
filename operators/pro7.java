import java.util.Scanner;
public class pro7{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cart=sc.nextInt();
        int mem=sc.nextInt();
        if(cart>999 || mem==1){
            System.out.println("Free shipping");
        }
        else{
            System.out.println("Charges Applied");
        }
        sc.close();
    }
}