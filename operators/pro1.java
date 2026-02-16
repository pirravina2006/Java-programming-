import java.util.Scanner;
public class pro1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int the=sc.nextInt();
        int pra=sc.nextInt();
        int avg=(the+pra)/2;
        if(the>=50 && pra>=50 && avg>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
