import java.util.Scanner;
public class employeewages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int wage=sc.nextInt();
        int overtime=sc.nextInt();
        int maincharge=sc.nextInt();
        wage=day*wage;
        overtime=overtime+wage;
        maincharge=overtime-maincharge;
        System.out.println(maincharge);
        sc.close();
    }
}
