import java.util.*;
public class problem15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int room=sc.nextInt();
        int price=sc.nextInt();
        int ser=sc.nextInt();
        int com=sc.nextInt();
        ser=ser+(room*price);
        com=ser-com;
        System.out.println(com);
        sc.close();
    }
}
