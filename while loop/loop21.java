import java.util.Scanner;
public class loop21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int range=sc.nextInt();
        int pro=1;
        int i=1;
        while (i<=range) {
            pro=i*n;
            System.out.println(n+" x "+i+" = "+pro);
            i++;
        }
        sc.close();
    }
}
