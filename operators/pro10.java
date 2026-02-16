import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        int volt=sc.nextInt();
        if(unit>500 || volt==1){
            System.out.println("Alert");
        }
        else{
            System.out.println("Normal");
        }
        sc.close();
    }
}
