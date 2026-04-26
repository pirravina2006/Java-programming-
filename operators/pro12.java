import java.util.Scanner;

public class pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int cycle=sc.nextInt();
        int comsize=size>>cycle;
        System.out.println(comsize);
        sc.close();
    }
}
