import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yield=sc.nextInt();
        int acre=sc.nextInt();
        int extra=sc.nextInt();
        int damage=sc.nextInt();
        extra=extra+(yield*acre);
        damage=extra-damage;
        System.out.println(damage);
        sc.close();
    }
}
