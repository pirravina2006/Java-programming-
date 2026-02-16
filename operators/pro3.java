import java.util.Scanner;
public class pro3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        int att=sc.nextInt();
        if(hour>40 && att>90){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
        sc.close();
    }
}