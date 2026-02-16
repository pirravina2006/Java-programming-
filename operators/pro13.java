import java.util.Scanner;

public class pro13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int conval=sc.nextInt();
        int app=sc.nextInt();
        int res=conval & app;
        if(res>0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
        sc.close();
    }
}
