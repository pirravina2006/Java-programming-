import java.util.Scanner;
public class problem16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int genp=sc.nextInt();
        int genf=sc.nextInt();
        int acp=sc.nextInt();
        int acf=sc.nextInt();
        int plat=sc.nextInt();
        int maint=sc.nextInt();
        int fuel=sc.nextInt();
        plat=plat+(acf*acp)+(genf*genp);
        maint=plat-maint;
        fuel=maint-fuel;
        System.out.println(fuel);
        sc.close();
    }
}