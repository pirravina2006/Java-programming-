import java.util.Scanner;

public class pro11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int box=sc.nextInt();
        int levels=sc.nextInt();
        int capacity=box<<levels;
        System.out.println(capacity);
        sc.close();
    }
}
