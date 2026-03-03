import java.util.Scanner;
public class loop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int count=0;
        while(i>=1 && i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
        sc.close();
    }
}
