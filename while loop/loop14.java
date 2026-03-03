import java.util.Scanner;
public class loop14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count=0;
        int temp=n;
        for(;n!=0;n=n/10){
            rev=n%10;
            count++;
        }
        int n2=temp;
        int sum=0;
        for(;temp!=0;temp=temp/10){
            rev=temp%10;
            int i=1;
            int res=1;
            while(i>=1 && i<=count){
                res=res*rev;
                i++;
            }
            sum=sum+res;
        }
        if(sum==n2){
            System.out.println(n2+" is an Armstrong number");
        }
        else{
            System.out.println(n2+" is not an Armstrong number");
        }
        sc.close();
    }
}
