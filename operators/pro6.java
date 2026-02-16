import java.util.Scanner;
public class pro6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int inc=sc.nextInt();
        int per=sc.nextInt();
        if(inc<200000 && per>=75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
        sc.close();
    }
}