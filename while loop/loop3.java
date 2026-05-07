import java.util.Scanner;
public class loop3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secnum=sc.nextInt();
        int i=1;
        int count=1;
        while(i>0 && i<50){
            System.out.println("Guess the number (1100) :");
            int num=sc.nextInt();
            if(num==secnum){
                System.out.println("Correct! Attempt :"+count);
                break;
            }
            else if(num<secnum){
                System.out.println("Too low!");
            }
            else if(num>secnum){
                System.out.println("Too high!");
            }
            count++;
        }
        sc.close();
    }
}