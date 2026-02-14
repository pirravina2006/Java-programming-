import java.util.Scanner;
public class scholarship {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int scholarship=sc.nextInt();
        int exam=sc.nextInt();
        int library=sc.nextInt();
        scholarship=fee*scholarship/100;
        int tot=fee-scholarship +exam +library;
        System.out.println(tot);
    }
}
