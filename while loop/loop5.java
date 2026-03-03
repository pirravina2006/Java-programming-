import java.util.Scanner;
public class loop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("Original : "+temp);
        System.out.println("Reversed  : "+rev);
        sc.close();
    }
}
