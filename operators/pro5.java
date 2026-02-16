import java.util.Scanner;
public class pro5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        int credit=sc.nextInt();
        if(sal>25000 && credit>700){
            System.out.println("Approved");
        }
        else{
            System.out.println("Rejected");
        }
        sc.close();
    }
}