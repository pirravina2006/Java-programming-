import java.util.Scanner;
public class loop20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int sum=0;
        while(n!=0){
            rev=n%10;
            int pro=1;
            for(int j=1;j<=rev;j++){
                pro=pro*j;
            }
            sum=sum+pro;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(temp+" is a strong number");
        }
        else{
            System.out.println(temp+" is not a strong number");
        }
        sc.close();
    }
}
