import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        int a=1;
        int count=0;
        while(i!=0 && a!=0){
            System.out.println("Enter a number (0 to stop) : ");
            a=sc.nextInt();
            if(a==0){
                break;
            }
            sum=sum+a;
            count++;
        }
        System.out.println("Total sum :"+sum);
        System.out.println("count : "+count);
        sc.close();
    }
}
