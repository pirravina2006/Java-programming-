import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String corpass=sc.next();
        int i=1;
        int n=3;
        int res=0;
        int count=1;
        while(i!=0 && i<=n){
            System.out.println("Enter a password :");
            String pas=sc.next();
            if(corpass.equals(pas)){
                System.out.println("Access granted ");
                break;
            }
            else{
                res=n-count;
                if(res>0 && res<=3){
                    System.out.println("Incorrect! Attempt remaining :"+res);
                }
                else if(res==0){
                    System.out.println("Account locked");
                    break;
                }
            }
            count++;
        }
        sc.close();
    }
}
