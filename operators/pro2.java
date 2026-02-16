import java.util.Scanner;
public class pro2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        int with=sc.nextInt();
        int limit=sc.nextInt();
        if(with<=bal && with<limit){
            System.out.println("Transaction Approved");
        }
        else{
            System.out.println("Transaction Declined");
        }
        sc.close();
    }
}