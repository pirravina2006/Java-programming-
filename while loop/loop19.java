import java.util.Scanner;
public class loop19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        int bin=0;
        int val=1;
        while (dec!=0) {
            int dig=dec%2;
            bin=(dig*val)+bin;
            val=val*10;
            dec=dec/2;
        }
        System.out.println(bin);
        sc.close();
    }
}
