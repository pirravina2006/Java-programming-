import java.util.Scanner;
public class problem23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wei=sc.nextInt();
        int rate=sc.nextInt();
        int pri=sc.nextInt();
        int ins=sc.nextInt();
        int han=sc.nextInt();
        int fuel=sc.nextInt();
        ins=ins+pri+(wei*rate);
        fuel=ins-han-fuel;
        System.out.println(fuel);
        sc.close();
    }
}
