import java.util.Scanner;
public class problem11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int dis=sc.nextInt();
        int rate=sc.nextInt();
        int main=sc.nextInt();
        int all=sc.nextInt();
        int sub=sc.nextInt();
        all=main+all+(dis*rate);
        sub=all-sub;
        System.out.println(sub);
        sc.close();
    }
}
