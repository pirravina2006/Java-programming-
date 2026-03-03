import java.util.Scanner;
public class loop22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int i=n1;
        int sum=0;
        while(i<=n2){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from "+n1+" to "+n2+" : "+sum);
        sc.close();
    }
}