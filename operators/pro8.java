import java.util.Scanner;
public class pro8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int id=sc.nextInt();
        if(age>18 && (id==1 || id==0)){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Denied");
        }
        sc.close();
    }
}