import java.util.Scanner;
public class loop8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rev=0;
        int temp=n;
        while (n!=0) {
            rev=n%10;
            sum=sum+rev;
            n=n/10;
        }
        System.out.println("Number : "+temp);
        System.out.println("Sum of digits is : "+sum);
        sc.close();
    }
}
