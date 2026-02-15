import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int add=sc.nextInt();
        int spon=sc.nextInt();
        int aff=sc.nextInt();
        int tax=sc.nextInt();
        int pro=sc.nextInt();
        aff=aff+add+spon;
        pro=aff-tax-pro;
        System.out.println(pro);
        sc.close();
    }
}
