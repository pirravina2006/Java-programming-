import java.util.Scanner;

public record problem12() {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tic=sc.nextInt();
        int snack=sc.nextInt();
        int maint=sc.nextInt();
        int elec=sc.nextInt();
        snack=tic+snack;
        maint=snack-maint;
        elec=maint-elec;
        System.out.println(elec);
        sc.close();
    }
}
