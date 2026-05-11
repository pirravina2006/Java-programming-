import java.util.Scanner;
public class loop6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        int i=1;
        int res=0;
        do{
            System.out.println("Balance : "+bal);
            System.out.println("Enter the withdrawal amount :");
            int with=sc.nextInt();
            if(with>100){
                if(with>bal){
                    System.out.println("Insufficient fund! Try again");
                }
                else if(with<=bal){
                    res=bal-with;
                    System.out.println("Withdrawal successful! Remaining balance : "+res);
                    break;
                }
            }
            else{
                System.out.println("Invalid amount! Try Again");
            }
            i++;
        }while(i>0 && i<10);
        sc.close();
    }
}
