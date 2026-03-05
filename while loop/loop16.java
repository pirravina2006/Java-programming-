import java.util.Scanner;
public class loop16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();
        int dec=0;
        int power=0;
        int temp=bin;
        while(bin!=0){
            int dig=bin%10;
            dec+=dig*Math.pow(2, power);
            power++;
            bin=bin/10;
        }
        System.out.println("Binary : "+temp);
        System.out.println("Decimal : "+dec);
        sc.close();
    }
}
