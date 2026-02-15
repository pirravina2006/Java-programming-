import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int rent=sc.nextInt();
        int late=sc.nextInt();
        int fuel=sc.nextInt();
        int maint=sc.nextInt();
        late=late+(day*rent);
        maint=late-fuel-maint;
        System.out.println(maint);
        sc.close();
    }
}
