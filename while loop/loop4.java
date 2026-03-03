import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int pro=1;
        while(i>=1 && i<=n){
            pro=pro*i;
            i++;
        }
        System.out.println("Factorial of "+n+" = "+pro);
        sc.close();
    }
}
