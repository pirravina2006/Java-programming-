import java.util.*;
public class problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int deli=sc.nextInt();
        int pay=sc.nextInt();
        int incent=sc.nextInt();
        int cost=sc.nextInt();
        incent=incent+(deli*pay);
        cost=incent-cost;
        System.out.println(cost);
        sc.close();
    }
}
