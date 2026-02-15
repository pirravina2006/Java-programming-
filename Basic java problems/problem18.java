import java.util.Scanner;
public class problem18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reg=sc.nextInt();
        int spon=sc.nextInt();
        int stall=sc.nextInt();
        int stage=sc.nextInt();
        int cel=sc.nextInt();
        int mar=sc.nextInt();
        stall=spon+stall+reg;
        mar=mar+cel+stage;
        int val=stall-mar;
        System.out.println(val);
        sc.close();
    }
}
