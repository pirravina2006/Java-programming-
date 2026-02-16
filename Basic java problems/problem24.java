import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reg=sc.nextInt();
        int bro=sc.nextInt();
        int spon=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int add=sc.nextInt();
        spon=spon+reg+bro;
        add=spon-prize-rent-add;
        System.out.println(add);
        sc.close();
    }
}
