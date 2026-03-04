import java.util.Scanner;
public class loop24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a=n1;
        int b=n2;
        while (n1!=n2) {
            if(n1>n2){
                n1=n1-n2;
            }else{
                n2=n2-n1;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" = "+n1);
        sc.close();
    }
}